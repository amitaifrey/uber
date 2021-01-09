package logic;
import org.apache.zookeeper.*;
import zkconn.ZKManagerImpl;
import generated.RideOffer;
import generated.RideOfferResponse;
import generated.RideRequest;
import generated.RideRequestResponse;
import generated.RideResponse;
import generated.RideOfferSnapshot;
import generated.CitySnapshot;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import generated.City;

public class Logic {
    private ZKManagerImpl allConn;
    private ZKManagerImpl myConn;
    private List<City> allCities;
    private City myCity;


    public Logic(ZKManagerImpl allConn, ZKManagerImpl myConn, List<City> allCities, City myCity) throws KeeperException, InterruptedException {
        this.allCities = allCities;
        this.myCity = myCity;
        this.allConn = allConn;
        this.myConn = myConn;

        try {
            myConn.create("/rides", "".getBytes());
        } catch (Exception e) {
            System.out.println("#1");
            System.out.println(e);
        }

        allConn.addWatch("/tx", this::handleTransaction, AddWatchMode.PERSISTENT);
        allConn.addWatch("/tx/" + myCity.getName(), this::handleCommit, AddWatchMode.PERSISTENT);
    }

    public void handleTransaction(WatchedEvent event) {
        if (event.getType() != Watcher.Event.EventType.NodeCreated) {
            return;
        }

        try {
            var txdata = allConn.getZNodeData(event.getPath(), false);
            var rides = RideRequestResponse.parseFrom(txdata);

            rides.getResponsesList().stream().filter(res -> myCity.getName().equals(res.getRide().getStartingPosition())).forEach(this::tryPrepare);
        } catch (Exception e) {
            System.out.println("#2");
            System.out.println(e);
        }
    }

    public boolean getShardLock() {
        try {
            myConn.createEphemeral("/tx", null); // take shard lock
        } catch (Exception ignored) {
            return false;
        }
        return true;
    }

    public void releaseShardLock() {
        try {
            myConn.createEphemeral("/tx", null); // take shard lock
        } catch (Exception ignored) {
            System.out.println("#4");
            return;
        }
    }

    public void tryPrepare(RideResponse res) {
        if (!getShardLock()) return;

        try {
            var ride = res.getRide();
            var city = ride.getStartingPosition();
            var data = myConn.getZNodeData("/rides/" + ride.getDepartureDate() + "/" + res.getId(), false);
            var rideOffer = RideOffer.parseFrom(data);
            var children = myConn.getChildren("/rides/" + ride.getDepartureDate() + "/" + ride);
            if (rideOffer.getInfo().getVacancies() >= children.size()) { // no vacancies:
                allConn.create("/tx/" + myCity.getName(), "prepare".getBytes());
            } else { // has vacancies:
                allConn.create("/tx/" + myCity.getName(), "abort".getBytes());
            }
        } catch (Exception ignored) {
            System.out.println("#4");
        }

        releaseShardLock();
    }

    public void handleCommit(WatchedEvent event) {
        if (event.getType() != Watcher.Event.EventType.NodeDataChanged) {
            return;
        }

        if (!getShardLock()) return; // TODO timeout?

        try {
            var txdata = allConn.getZNodeData(event.getPath(), false);
            if (!Arrays.toString(txdata).equals("commit")) {
                releaseShardLock();
                return;
            }

            try {
                var data = myConn.getZNodeData("/commit_log", false);
                allConn.update("/tx/" + myCity.getName(), "committed".getBytes());
            } catch (KeeperException.NoNodeException ignored) {
            } catch (Exception e) {
                System.out.println(e);
                releaseShardLock();
                return;
            }

            txdata = allConn.getZNodeData("/tx", false);
            var rides = RideRequestResponse.parseFrom(txdata);
            var myRides = rides.getResponsesList().stream().filter(res -> myCity.getName().equals(res.getRide().getStartingPosition())).collect(Collectors.toList());
            commitRides(myRides);
            allConn.update("/tx/" + myCity.getName(), "committed".getBytes());
            myConn.delete("/commit_log");
        } catch (Exception e) {
            System.out.println("#5");
            System.out.println(e);
        }

        releaseShardLock();
    }

    public void commitRides(List<RideResponse> rides) throws KeeperException, InterruptedException {
        Transaction txn = myConn.zkeeper.transaction();
        for (var ride : rides) {
            String childPath = "/rides/" + ride.getRide().getDepartureDate() + "/" + ride.getId() + "/";
            txn.create(childPath, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
        }
        txn.create("/commit_log", null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        txn.commit();
    }

    public RideOfferResponse NewRide(RideOffer offer) {
        var city = offer.getRide().getStartingPosition();
        var date = offer.getRide().getDepartureDate();
        try {
            if (!myConn.getChildren("/rides").contains(date)) {
                myConn.create("/rides/" + date, null);
            }
            myConn.createSequential("/rides/" + date + "/", offer.toByteArray());
        } catch (Exception e) {
            System.out.println("#6");
            System.out.println(e);
        }
        System.out.println("done");
        return RideOfferResponse.newBuilder().build();
    }

    public CitySnapshot GetSnapshot() {
        var snapshot = CitySnapshot.newBuilder();
        try {
            System.out.println("a");
            var dates = myConn.getChildren("/rides");
            System.out.println("b");
            for (var date : dates) {
                var rides = myConn.getChildren("/rides/" + date);
                System.out.println("c");
                for (var ride : rides) {
                    var data = myConn.getZNodeData("/rides/" + date + "/" + ride, false);
                    var rideOffer = RideOffer.parseFrom(data);
                    var rideSnapshot = RideOfferSnapshot.newBuilder();
                    rideSnapshot.setOffer(rideOffer);
                    var reqs = myConn.getChildren("/rides/" + date + "/" + ride);
                    for (var req : reqs) {
                        data = myConn.getZNodeData("/rides/" + date + "/" + ride + "/" + req, false);
                        var rideRequest = RideRequest.parseFrom(data);
                        rideSnapshot.addRequests(rideRequest);
                    }
                    snapshot.addRides(rideSnapshot.build());
                }
            }
        } catch (Exception e) {
            System.out.println("#7");
            System.out.println(e);
        }
        return snapshot.build();
    }

//    public Snapshot GetSnapshot() {
//        var snapshot = Snapshot.newBuilder();
//        for (city : this.conf.all_cities) {
//
//        }
//    }
}
