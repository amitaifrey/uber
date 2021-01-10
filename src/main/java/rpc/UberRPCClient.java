package rpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import generated.UberServiceGrpc;
import java.util.logging.Logger;


public class UberRPCClient {
    private static final Logger logger = Logger.getLogger(UberRPCClient.class.getName());

    private final UberServiceGrpc.UberServiceBlockingStub blockingStub;
    private final UberServiceGrpc.UberServiceStub asyncStub;

    public UberRPCClient(String target) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        blockingStub = UberServiceGrpc.newBlockingStub(channel);
        asyncStub = UberServiceGrpc.newStub(channel);
    }


    public void listFeatures(int lowLat, int lowLon, int hiLat, int hiLon) {
//        Rectangle request =
//                Rectangle.newBuilder()
//                        .setLo(Point.newBuilder().setLatitude(lowLat).setLongitude(lowLon).build())
//                        .setHi(Point.newBuilder().setLatitude(hiLat).setLongitude(hiLon).build()).build();
//        Iterator<Feature> features;
//        try {
//            features = blockingStub.listFeatures(request);
//            for (int i = 1; features.hasNext(); i++) {
//                Feature feature = features.next();
//                System.out.println("Name : " + feature.getName()+"\nlocation : \n" + feature.getLocation());
//                System.out.println("-------------");
//            }
//        } catch (StatusRuntimeException e) {
//            e.printStackTrace();
//        }
    }

    public void routeChat(){
//        StreamObserver<RouteNote> requestObserver =
//                asyncStub.routeChat(new StreamObserver<RouteNote>() {
//                    @Override
//                    public void onNext(RouteNote note) {
//                        System.out.println(note.getMessage());
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//                        System.out.println(t.getMessage());
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        System.out.println("Client side stream completed");
//                    }
//                });
//
//        try {
//            RouteNote[] requests =
//                    {
//                            newNote("First message", 0, 0),
//                            newNote("Second message", 0, 1),
//                            newNote("Third message", 1, 0),
//                            newNote("Fourth message", 1, 1)
//                    };
//
//            for (RouteNote request : requests) {
//                requestObserver.onNext(request);
//            }
//        } catch (RuntimeException e) {
//            // Cancel RPC
//            requestObserver.onError(e);
//            e.printStackTrace();
//        }
//        // Mark the end of requests
//        requestObserver.onCompleted();
    }
//
//    private RouteNote newNote(String message, int lat, int lon) {
//        return RouteNote.newBuilder().setMessage(message)
//                .setLocation(Point.newBuilder().setLatitude(lat).setLongitude(lon).build()).build();
//    }

}
