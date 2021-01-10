package logic;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.zookeeper.*;
import zkconn.ZKManagerImpl;
import generated.CommitRequest;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import generated.CommitInfo;
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

    private class RideStorage {
        public RideOffer offer;
        public List<CommitInfo> infos;
        public boolean Locked;

        public RideStorage(RideOffer offer) {
            this.offer = offer;
            this.infos = new LinkedList<CommitInfo>();
            this.Locked = false;
        }
    }

    private ZKManagerImpl conn;
    private List<City> allCities;
    private City myCity;
    private String IP;

    private HashMap<String, HashMap<String, RideStorage>> storage;


    public Logic(ZKManagerImpl conn, List<City> allCities, City myCity, String IP) throws KeeperException, InterruptedException {
        this.allCities = allCities;
        this.myCity = myCity;
        this.conn = conn;
        this.IP = IP;
        this.storage = new HashMap<String, HashMap<String, RideStorage>>();

        try {
            conn.create("/"+myCity.getName(), null);
        } catch (Exception ignored) { }
        conn.createSequentialEphemeral("/"+myCity.getName()+"/", IP.getBytes(StandardCharsets.UTF_8));
    }

    public String getLeaderIPByName(String name) throws KeeperException, InterruptedException {
        var children = conn.getChildren("/" + name);
        var leaderNode =  children.stream().sorted().collect(Collectors.toList()).get(0);
        var data = conn.getZNodeData("/" + name + "/" + leaderNode, false);
        return new String(data, StandardCharsets.UTF_8);
    }

    public List<String> getMembers() throws KeeperException, InterruptedException {
        var children = conn.getChildren("/" + myCity.getName());
        return children.stream().map(path -> {
            System.out.println("Path: " + path);
            try {
                return new String(conn.getZNodeData("/" + myCity.getName() + "/" + path, false), StandardCharsets.UTF_8);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }

    public RideOffer NewRide(RideOffer offer) throws KeeperException, InterruptedException {
        if (!storage.containsKey(offer.getRide().getDepartureDate())) {
            storage.put(offer.getRide().getDepartureDate(), new HashMap<String, RideStorage>());
        }
        var uuid = UUID.randomUUID().toString();
        offer = offer.toBuilder().setUuid(uuid).build();
        AddRideToStorage(offer);

        BroadcastNewRide(offer);
        return offer;
    }

    public void BroadcastNewRide(RideOffer offer) throws KeeperException, InterruptedException {
        for (var member : getMembers()) {
            if (member.equals(IP)) continue;
            ManagedChannel channel = ManagedChannelBuilder.forTarget(member).usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            blockingStub.addRideOffer(offer);
        }
    }

    public void AddRideToStorage(RideOffer offer) {
        storage.get(offer.getRide().getDepartureDate()).put(offer.getUuid(), new RideStorage(offer));
    }

    public boolean IsRideOfferExists(RideOffer offer) {
        if (!storage.containsKey(offer.getRide().getDepartureDate())) {
            return false;
        }

        return storage.get(offer.getRide().getDepartureDate()).containsKey(offer.getUuid());
    }

    public RideStorage GetRideStorage(RideOffer offer) {
        return storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid());
    }

    public boolean HasVacancies(RideOffer offer) {
        var rideStorage = storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid());
        return rideStorage.infos.size() < rideStorage.offer.getInfo().getVacancies();
    }

    public boolean IsLocked(RideOffer offer) {
        return storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked;
    }

    public void LockRide(RideOffer offer) {
        storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked = true;
    }

    public void UnlockRide(RideOffer offer) {
        storage.get(offer.getRide().getDepartureDate()).get(offer.getUuid()).Locked = false;
    }

    public void BroadcastLockRide(RideOffer offer) throws KeeperException, InterruptedException {
        for (var member : getMembers()) {
            if (member.equals(IP)) continue;
            ManagedChannel channel = ManagedChannelBuilder.forTarget(member).usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            blockingStub.lockRide(offer);
        }
    }

    public void BroadcastCommitRide(CommitRequest req) throws KeeperException, InterruptedException {
        for (var member : getMembers()) {
            if (member.equals(IP)) continue;
            ManagedChannel channel = ManagedChannelBuilder.forTarget(member).usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            blockingStub.commitRide(req);
        }
    }

    public void CommitRide(CommitRequest req) {
        storage.get(req.getOffer().getRide().getDepartureDate()).get(req.getOffer().getUuid()).infos.add(req.getInfo());
        UnlockRide(req.getOffer());
    }

    public PlanRideOffers GetSuitableRides(RideRequest req) {
        var plan = PlanRideOffers.newBuilder();
        if (!storage.containsKey(req.getDepartureDate())) {
            for (int i=0; i < req.getCitiesList().size()-1; i++) {
                plan.addRideOffers(RideOffers.newBuilder().build());
            }
            return plan.build();
        }

        for (int i=0; i < req.getCitiesList().size()-1; i++) {
            var start = req.getCitiesList().get(i);
            var end = req.getCitiesList().get(i + 1);

            System.out.println(storage.get(req.getDepartureDate()).values());
            var relevantOffers = storage.get(req.getDepartureDate()).values().stream()
                    .filter(r -> IsRideSuitable(r, start, end)).collect(Collectors.toList());
            var mapped = relevantOffers.stream().map(r -> {
                System.out.println("MAP:\n" + r.toString());
                return r.offer;
            }).collect(Collectors.toList());
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

        var city1 = allCities.stream().filter(c->c.getName().equals(ride.offer.getRide().getStartingPosition())).collect(Collectors.toList()).get(0);
        var city2 = allCities.stream().filter(c->c.getName().equals(ride.offer.getRide().getEndingPosition())).collect(Collectors.toList()).get(0);

        var city0 = allCities.stream().filter(c->c.getName().equals(end)).collect(Collectors.toList()).get(0);
        if (end.equals(ride.offer.getRide().getEndingPosition())) {
            city0 = allCities.stream().filter(c->c.getName().equals(start)).collect(Collectors.toList()).get(0);
        }

        // TODO test distances
        var distance = Math.abs(((city2.getX() - city1.getX())*(city1.getY() - city0.getY())) - ((city1.getX() - city0.getX())*(city2.getY() - city1.getY()))) /
                Math.sqrt((city2.getX() - city1.getX())^2 + (city2.getY() - city1.getY())^2);

        return distance <= ride.offer.getInfo().getPermittedDeviation();
    }

    public PlanRideOffers GetRequestOffers(RideRequest req) throws KeeperException, InterruptedException {
        var final_offers = new LinkedList<RideOffers>();
        for (int i=0; i < req.getCitiesList().size()-1; i++) {
            final_offers.add(i, RideOffers.newBuilder().build());
        }

        for (var city : allCities) {
            var leader = getLeaderIPByName(city.getName());
            ManagedChannel channel = ManagedChannelBuilder.forTarget(leader+":8980").usePlaintext().build();
            var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
            var planRequest = RidePlanRequest.newBuilder().setRequest(req).setCity(city.getName()).build();
            var plan_offers = blockingStub.requestRide(planRequest);
            for (int i=0; i < req.getCitiesList().size()-1; i++) {
                var old_offers = final_offers.get(i);
                var thisOffers = plan_offers.getRideOffersList();
                var new_offers = old_offers.toBuilder().mergeFrom(thisOffers.get(i)).build();
                final_offers.set(i, new_offers);
            }
        }

        return PlanRideOffers.newBuilder().addAllRideOffers(final_offers).build();
    }

    public String PlanRide(RideRequest req) {
        try {
            var plan_offers = GetRequestOffers(req);
            var wanted = RideOffers.newBuilder();

            // TODO select unique rides
            for (var offers : plan_offers.getRideOffersList()) {
                if(offers.getOffersList().size() == 0) return "";
                Random rand = new Random();
                wanted.addOffers(offers.getOffersList().get(rand.nextInt(offers.getOffersList().size())));
            }
            var rides = wanted.build();

            for (var ride : rides.getOffersList()) {
                var leader = getLeaderIPByName(ride.getRide().getStartingPosition());
                ManagedChannel channel = ManagedChannelBuilder.forTarget(leader+":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                if (!blockingStub.lockRide(ride).getResult()) return "";
            }

            var uuid = UUID.randomUUID().toString();
            for (var ride : rides.getOffersList()) {
                var leader = getLeaderIPByName(ride.getRide().getStartingPosition());
                ManagedChannel channel = ManagedChannelBuilder.forTarget(leader+":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                var commit = CommitRequest.newBuilder().setInfo(generated.CommitInfo.newBuilder().
                        setId(uuid).setPerson(req.getPerson())).setOffer(ride).build();
                blockingStub.commitRide(commit);
            }

            return uuid;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
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
                var leader = getLeaderIPByName(city.getName());
                ManagedChannel channel = ManagedChannelBuilder.forTarget(leader+":8980").usePlaintext().build();
                var blockingStub = generated.UberServiceGrpc.newBlockingStub(channel);
                var citySnapshot = blockingStub.getCitySnapshot(city);
                snapshot.addSnapshots(citySnapshot);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return snapshot.build();
    }
}
