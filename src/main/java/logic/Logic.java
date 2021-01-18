package logic;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.zookeeper.*;
import zkconn.ZKManagerImpl;
import generated.CommitRequest;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import generated.RideOffer;
import generated.City;
import generated.CitySnapshot;
import generated.RideOfferSnapshot;
import generated.RideRequest;
import generated.RideOffers;
import generated.PlanRideOffers;
import generated.RidePlanRequest;
import generated.Snapshot;

public class Logic {
    private ZKManagerImpl conn;
    private List<City> allCities;
    private City myCity;
    private String IP;
    private Lock lock;
    private HashMap<String, HashMap<String, RideStorage>> storage;
    private int numOfRetries;
    private int lockTimeoutSeconds;

    public Logic(ZKManagerImpl conn, List<City> allCities, City myCity, String IP, int numOfRetries, int lockTimeoutSeconds) {
        this.allCities = allCities;
        this.myCity = myCity;
        this.conn = conn;
        this.IP = IP;
        this.storage = new HashMap<String, HashMap<String, RideStorage>>();
        this.lock = new ReentrantLock();
        this.numOfRetries = numOfRetries;
        this.lockTimeoutSeconds = lockTimeoutSeconds;
    }

    public void Start() throws KeeperException, InterruptedException {
        try {
            conn.create("/" + myCity.getName(), null);
        } catch (Exception ignored) {
        }
        try {
            var leader = getLeaderIPByName(myCity.getName());
            ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            blockingStub.requestState(generated.StateRequest.newBuilder().setCity(myCity).setIp(IP).build());
            channel.shutdown();
        } catch (Exception ignored) {
            conn.createSequentialEphemeral("/" + myCity.getName() + "/", IP.getBytes(StandardCharsets.UTF_8));
        }
    }

    public String getLeaderIPByName(String name) throws KeeperException, InterruptedException {
        var children = conn.getChildren("/" + name);
        var leaderNode = children.stream().sorted().collect(Collectors.toList()).get(0);
        var data = conn.getZNodeData("/" + name + "/" + leaderNode, false);
        return new String(data, StandardCharsets.UTF_8);
    }

    public List<String> getMembers() throws KeeperException, InterruptedException {
        var children = conn.getChildren("/" + myCity.getName());
        return children.stream().map(path -> {
            try {
                return new String(conn.getZNodeData("/" + myCity.getName() + "/" + path, false), StandardCharsets.UTF_8);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).sorted().collect(Collectors.toList());
    }

    public RideOffer NewRide(RideOffer offer) throws KeeperException, InterruptedException {
        if (IsRideOfferExists(offer)) return null;
        var uuid = UUID.randomUUID().toString();
        offer = offer.toBuilder().setUuid(uuid).build();
        AddRideToStorage(offer);
        BroadcastNewRide(offer);
        return offer;
    }

    public RideOffer NewRemoteRide(RideOffer offer) throws KeeperException, InterruptedException {
        for (int i = 0; i < numOfRetries; i++) {
            try {
                var leader = getLeaderIPByName(offer.getRide().getStartingPosition());
                ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                var result = blockingStub.addRemoteRide(offer);
                return result;
            } catch (Exception e) {
                if (i == numOfRetries - 1) throw e;
            }
        }
        return null; // unreachable
    }

    public void BroadcastNewRide(RideOffer offer) throws KeeperException, InterruptedException {
        lock.lock();
        try {
            for (var member : getMembers()) {
                if (member.equals(IP)) continue;
                ManagedChannel channel = ManagedChannelBuilder.forTarget(member + ":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                blockingStub.addRideOffer(offer);
                channel.shutdown();
            }
        } catch (Exception e) {
            lock.unlock();
            throw e;
        }
            lock.unlock();
        }

    public void AddRideToStorage(RideOffer offer) {
        lock.lock();
        if (!storage.containsKey(offer.getRide().getDepartureDate())) {
            storage.put(offer.getRide().getDepartureDate(), new HashMap<String, RideStorage>());
        }

        storage.get(offer.getRide().getDepartureDate()).put(offer.getUuid(), new RideStorage(offer));
        lock.unlock();
    }

    public boolean IsRideOfferExists(RideOffer offer) {
        if (!storage.containsKey(offer.getRide().getDepartureDate())) {
            return false;
        }

        return storage.get(offer.getRide().getDepartureDate()).containsKey(offer.getUuid());
    }

    public boolean HasVacancies(RideOffer offer) {
        var rideStorage = storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid());
        return rideStorage.infos.size() < rideStorage.offer.getInfo().getVacancies();
    }

    public boolean IsLocked(RideOffer offer) {
        var lock = storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked;
        return lock != null && lock.isAfter(LocalDateTime.now().minusSeconds(lockTimeoutSeconds));
    }

    public boolean LockRide(RideOffer offer) {
        lock.lock();
        if (IsRideOfferExists(offer)) {
            if (!IsLocked(offer) && HasVacancies(offer)) {
                storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked = LocalDateTime.now();
                lock.unlock();
                return true;
            }
        }

        lock.unlock();
        return false;
    }

    public void UnlockRide(RideOffer offer) {
        storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked = null;
    }

    public void BroadcastLockRide(RideOffer offer) throws KeeperException, InterruptedException {
        lock.lock();
        try {
            for (var member : getMembers()) {
                if (member.equals(IP)) continue;
                ManagedChannel channel = ManagedChannelBuilder.forTarget(member + ":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                blockingStub.lockRide(offer);
                channel.shutdown();
            }
        } catch (Exception e) {
            lock.unlock();
            throw e;
        }
        lock.unlock();
    }

    public void BroadcastCommitRide(CommitRequest req) throws KeeperException, InterruptedException {
        lock.lock();
        try {
            for (var member : getMembers()) {
                if (member.equals(IP)) continue;
                ManagedChannel channel = ManagedChannelBuilder.forTarget(member + ":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                blockingStub.commitRide(req);
                channel.shutdown();
            }
        } catch (Exception e) {
            lock.unlock();
            throw e;
        }
        lock.unlock();
    }

    public boolean CommitRide(CommitRequest req) {
        lock.lock();
        if (IsRideOfferExists(req.getOffer())) {
            if (IsLocked(req.getOffer())) {
                storage.get(req.getOffer().getRide().getDepartureDate()).get(req.getOffer().getUuid()).infos.add(req.getInfo());
                UnlockRide(req.getOffer());
                lock.unlock();
                return true;
            }
        }

        lock.unlock();
        return false;
    }

    public PlanRideOffers GetSuitableRides(RideRequest req) {
        var plan = PlanRideOffers.newBuilder();
        if (!storage.containsKey(req.getDepartureDate())) {
            for (int i = 0; i < req.getCitiesList().size() - 1; i++) {
                plan.addRideOffers(RideOffers.newBuilder().build());
            }
            return plan.build();
        }

        for (int i = 0; i < req.getCitiesList().size() - 1; i++) {
            var start = req.getCitiesList().get(i);
            var end = req.getCitiesList().get(i + 1);

            System.out.println(storage.get(req.getDepartureDate()).values());
            var relevantOffers = storage.get(req.getDepartureDate()).values().stream()
                    .filter(r -> IsRideSuitable(r, start, end)).collect(Collectors.toList());
            var mapped = relevantOffers.stream().map(r -> r.offer).collect(Collectors.toList());
            var offers = RideOffers.newBuilder().addAllOffers(mapped);
            plan.addRideOffers(offers);
        }
        return plan.build();
    }

    public boolean IsRideSuitable(RideStorage ride, String start, String end) {
        if ((!start.equals(ride.offer.getRide().getStartingPosition()) && !end.equals(ride.offer.getRide().getEndingPosition())) ||
                ride.offer.getInfo().getVacancies() <= ride.infos.size()) return false;

        if (start.equals(ride.offer.getRide().getStartingPosition()) && end.equals(ride.offer.getRide().getEndingPosition()) &&
                ride.offer.getInfo().getVacancies() > ride.infos.size()) return true;

        var city1 = allCities.stream().filter(c -> c.getName().equals(ride.offer.getRide().getStartingPosition())).collect(Collectors.toList()).get(0);
        var city2 = allCities.stream().filter(c -> c.getName().equals(ride.offer.getRide().getEndingPosition())).collect(Collectors.toList()).get(0);

        var city0 = allCities.stream().filter(c -> c.getName().equals(end)).collect(Collectors.toList()).get(0);
        if (end.equals(ride.offer.getRide().getEndingPosition())) {
            city0 = allCities.stream().filter(c -> c.getName().equals(start)).collect(Collectors.toList()).get(0);
        }

        var distance = Math.abs(((city2.getX() - city1.getX()) * (city1.getY() - city0.getY())) - ((city1.getX() - city0.getX()) * (city2.getY() - city1.getY()))) /
                Math.sqrt(Math.pow(city2.getX() - city1.getX(), 2) + Math.pow(city2.getY() - city1.getY(), 2));

        return distance <= ride.offer.getInfo().getPermittedDeviation();
    }

    public PlanRideOffers GetRequestOffers(RideRequest req) throws KeeperException, InterruptedException {
        var final_offers = new LinkedList<RideOffers>();
        for (int i = 0; i < req.getCitiesList().size() - 1; i++) {
            final_offers.add(i, RideOffers.newBuilder().build());
        }

        for (var city : allCities) {
            var success = false;
            for (int r = 0; r < numOfRetries && !success; r++) {
                try {
                    var leader = getLeaderIPByName(city.getName());
                    ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
                    var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                    var planRequest = RidePlanRequest.newBuilder().setRequest(req).setCity(city.getName()).build();
                    var plan_offers = blockingStub.requestRide(planRequest);
                    for (int i = 0; i < req.getCitiesList().size() - 1; i++) {
                        var old_offers = final_offers.get(i);
                        var thisOffers = plan_offers.getRideOffersList();
                        var new_offers = old_offers.toBuilder().mergeFrom(thisOffers.get(i)).build();
                        final_offers.set(i, new_offers);
                    }
                    channel.shutdown();
                    success = true;
                } catch (Exception e) {
                    if (r == numOfRetries - 1) throw e;
                }
            }
        }

        return PlanRideOffers.newBuilder().addAllRideOffers(final_offers).build();
    }

    public List<List<Integer>> cartesian(List<Integer> lists) {
        if (lists.size() == 1) {
            var list = new LinkedList<List<Integer>>();
            for (int i = 0; i < lists.get(0); i++ ){
                int finalI = i;
                list.add(new LinkedList<Integer>() {{add(finalI);}});
            }
            return list;
        }

        var result = new LinkedList<List<Integer>>();
        for (int i : IntStream.range(0, lists.get(0)).boxed().collect(Collectors.toList())) {
            var idxs = cartesian(lists.subList(1, lists.size()));
            for (var idx : idxs) {
                idx.add(0, i);
                result.add(idx);
            }
        }
        return result;
    }

    public RideOffers GetValidOffers(PlanRideOffers planOffers) {
        var perms = cartesian(planOffers.getRideOffersList().stream().map(o -> o.getOffersList().size()).collect(Collectors.toList()));
        Collections.shuffle(perms);

        for (var perm : perms) {
            var offersSet = new HashSet<String>();
            var offers = new LinkedList<RideOffer>();
            for (int i = 0; i < perm.size(); i++) {
                var offer = planOffers.getRideOffersList().get(i).getOffersList().get(perm.get(i));
                if (offersSet.contains(offer.getUuid())) break;
                offers.add(offer);
                offersSet.add(offer.getUuid());
            }
            if (offers.size() == perm.size()) return RideOffers.newBuilder().addAllOffers(offers).build();
        }


        return null;
    }

    public String PlanRide(RideRequest req) {
        try {
            var planOffers = GetRequestOffers(req);

            if (planOffers.getRideOffersList().stream().anyMatch(o -> o.getOffersList().size() == 0)) return "";
            var rides = GetValidOffers(planOffers);
            if (null == rides) return "";

            // Sort to use Dining Philosopher's Algorithm (thank you Dijkstra)
            for (var ride : rides.getOffersList().stream().sorted(Comparator.comparing(RideOffer::getUuid)).collect(Collectors.toList())) {
                var success = false;
                for (int r = 0; r < numOfRetries && !success; r++) {
                    try {
                        var leader = getLeaderIPByName(ride.getRide().getStartingPosition());
                        ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
                        var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                        if (!blockingStub.lockRide(ride).getResult()) {
                            channel.shutdown();
                            return "";
                        }
                        channel.shutdown();
                        success = true;
                    } catch (Exception e) {
                        if (r == numOfRetries - 1) throw e;
                    }
                }
            }

            var uuid = UUID.randomUUID().toString();
            for (int i = 0; i < rides.getOffersList().size(); i++) {
                var success = false;
                for (int r = 0; r < numOfRetries && !success; r++) {
                    try {
                        var ride = rides.getOffersList().get(i);
                        var start = req.getCitiesList().get(i);
                        var end = req.getCitiesList().get(i + 1);
                        var leader = getLeaderIPByName(ride.getRide().getStartingPosition());
                        ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
                        var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                        var commit = CommitRequest.newBuilder().setInfo(generated.CommitInfo.newBuilder().
                                setId(uuid).setPerson(req.getPerson()).setStartingPosition(start).setEndingPosition(end).build())
                                .setOffer(ride).build();
                        blockingStub.commitRide(commit);
                        channel.shutdown();
                        success = true;
                    } catch (Exception e) {
                        if (r == numOfRetries - 1) throw e;
                    }
                }
            }

            return uuid;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void SendState(generated.StateRequest req) {
        lock.lock();
        try {
            var stream = new ByteArrayOutputStream();
            var out = new ObjectOutputStream(stream);
            out.writeObject(storage);
            out.close();
            ManagedChannel channel = ManagedChannelBuilder.forTarget(req.getIp() + ":8980").usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            blockingStub.setState(generated.State.newBuilder().setData(ByteString.copyFrom(stream.toByteArray())).setCity(req.getCity()).build());
            channel.shutdown();
        } catch (Exception e) {
            lock.unlock();
            e.printStackTrace();
            return;
        }
        lock.unlock();
    }

    public void SetState(ByteString state) {
        try {
            var stream = new ByteArrayInputStream(state.toByteArray());
            var in = new ObjectInputStream(stream);
            storage = (HashMap<String, HashMap<String, RideStorage>>) in.readObject();
            in.close();
            conn.createSequentialEphemeral("/" + myCity.getName() + "/", IP.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CitySnapshot GetCitySnapshot() {
        var snapshot = CitySnapshot.newBuilder();
        snapshot.setName(myCity.getName());
        for (var ridesMap : storage.values()) {
            for (var ride : ridesMap.values()) {
                var rideOfferSnapshot = RideOfferSnapshot.newBuilder().setOffer(ride.offer).
                        addAllInfos(ride.infos);
                snapshot.addRides(rideOfferSnapshot);
            }
        }
        return snapshot.build();
    }

    public Snapshot GetSnapshot() {
        var snapshot = Snapshot.newBuilder();
        try {
            for (var city : allCities) {
                var success = false;
                for (int r = 0; r < numOfRetries && !success; r++) {
                    try {
                        var leader = getLeaderIPByName(city.getName());
                        ManagedChannel channel = ManagedChannelBuilder.forTarget(leader + ":8980").usePlaintext().build();
                        var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                        System.out.println(leader);
                        var citySnapshot = blockingStub.getCitySnapshot(city);
                        snapshot.addSnapshots(citySnapshot);
                        channel.shutdown();
                        success = true;
                    } catch (Exception e) {
                        if (r == numOfRetries - 1) throw e;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return snapshot.build();
    }
}
