package logic;

import com.google.protobuf.InvalidProtocolBufferException;
import conf.Configuration;
import jdk.jfr.EventType;
import org.apache.tomcat.jni.Time;
import org.apache.zookeeper.AddWatchMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.proto.WatcherEvent;
import zkconn.ZKManagerImpl;
import generated.RideOffer;
import generated.RideOfferResponse;
import generated.RideRequest;
import generated.RideRequestResponse;
import generated.Snapshot;
import generated.RideOfferSnapshot;
import generated.CitySnapshot;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Logic {
    private Configuration conf;
    private HashMap<String, ZKManagerImpl> zkConnections;

    public Logic(Configuration conf, HashMap<String, ZKManagerImpl> zkConnections) throws KeeperException, InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        this.conf = conf;
        this.zkConnections = zkConnections;
        for (var conn : zkConnections.values()) {
            System.out.println(conn);
            System.out.println("creating /rides");
            //conn.create("/rides", "".getBytes());
            System.out.println("created /rides");
        }

        this.zkConnections.get("all").addWatch("/rides", this::handleTransaction, AddWatchMode.PERSISTENT_RECURSIVE);
    }

    public void handleTransaction(WatchedEvent event) throws KeeperException, InterruptedException, InvalidProtocolBufferException {
        if (event.getType() != Watcher.Event.EventType.NodeCreated || event.getPath().chars().filter(ch -> ch == '/').count() != 2) {
            return;
        }

        var allConn = zkConnections.get("all");
        for (var conn : zkConnections.values()) {
            var txdata = allConn.getZNodeData(event.getPath(), false);
            var rides = RideRequestResponse.parseFrom(txdata);
            rides.getResponsesList().stream().filter(res -> zkConnections.containsKey(res.getRide().getStartingPosition())).forEach(res -> {
                try {
                    var ride = res.getRide();
                    var city = ride.getStartingPosition();
                    var data = zkConnections.get(city).getZNodeData("/rides/" + ride.getDepartureDate() + "/" + res.getId(), false);
                    var rideOffer = RideOffer.parseFrom(data);
                    if
                } catch (Exception ignored) {}
            });

        }
    }

    public RideOfferResponse NewRide(RideOffer offer) {
        var city = offer.getRide().getStartingPosition();
        var date = offer.getRide().getDepartureDate();
        try {
            if (!zkConnections.get(city).getChildren("/rides").contains(date)) {
                zkConnections.get(city).create("/rides/" + date, null);
            }
            zkConnections.get(city).createSequential("/rides/" + date + "/", offer.toByteArray());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("done");
        return RideOfferResponse.newBuilder().build();
    }

    public CitySnapshot GetSnapshot() {
        var snapshot = CitySnapshot.newBuilder();
        try {
            for (var conn : zkConnections.values()) {
                var dates = conn.getChildren("/rides");
                for (var date : dates) {
                    var rides = conn.getChildren("/rides/" + date);
                    for (var ride : rides) {
                        var data = conn.getZNodeData("/rides/" + date + "/" + ride, false);
                        var rideOffer = RideOffer.parseFrom(data);
                        var rideSnapshot = RideOfferSnapshot.newBuilder();
                        rideSnapshot.setOffer(rideOffer);
                        var reqs = conn.getChildren("/rides/" + date + "/" + ride);
                        for (var req : reqs) {
                            data = conn.getZNodeData("/rides/" + date + "/" + ride + "/" + req, false);
                            var rideRequest = RideRequest.parseFrom(data);
                            rideSnapshot.addRequests(rideRequest);
                        }
                        snapshot.addRides(rideSnapshot.build());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return snapshot.build();
    }

//    public Snapshot GetSnapshot() {
//        var snapsjot = Snapshot.newBuilder();
//        for (city : this.conf.all_cities) {
//
//        }
//    }
}
