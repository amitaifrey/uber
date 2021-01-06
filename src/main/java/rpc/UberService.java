package rpc;

import io.grpc.stub.StreamObserver;

import generated.UberServiceGrpc;

public class UberService extends UberServiceGrpc.UberServiceImplBase {

//    private final Collection<Feature> features;
//    private final ConcurrentMap<Point, List<RouteNote>> routeNotes =
//            new ConcurrentHashMap<Point, List<RouteNote>>();

    public UberService() {
    }

    // Server streaming
    @Override
    public void offerRide(generated.RideOffer request, StreamObserver<generated.RideOfferResponse> responseObserver) {
//        // Calculate the rectangle boundaries
//        int left = min(request.getLo().getLongitude(), request.getHi().getLongitude());
//        int right = max(request.getLo().getLongitude(), request.getHi().getLongitude());
//        int top = max(request.getLo().getLatitude(), request.getHi().getLatitude());
//        int bottom = min(request.getLo().getLatitude(), request.getHi().getLatitude());
//
//        for (Feature feature : features) {
//            int lat = feature.getLocation().getLatitude();
//            int lon = feature.getLocation().getLongitude();
//            // Check whether the feature is in the rectangle
//            if (lon >= left && lon <= right && lat >= bottom && lat <= top) {
//                responseObserver.onNext(feature);
//            }
//        }
//        responseObserver.onCompleted();
    }

    // Bidirectional streaming
    @Override
    public void requestRide(generated.RideRequest request, StreamObserver<generated.RideRequestResponse> responseObserver) {
//        return new StreamObserver<RouteNote>() {
//            @Override
//            public void onNext(RouteNote note) {
//                System.out.println("Request of " + note.getMessage());
//                RouteNote serverNote = RouteNote.newBuilder()
//                        .setLocation(note.getLocation())
//                        .setMessage("Respond to " + note.getMessage()).build();
//                responseObserver.onNext(serverNote);
//            }
//
//            @Override
//            public void onError(Throwable t) {
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Server side stream completed");
//                responseObserver.onCompleted();
//            }
//        };
    }

    // Bidirectional streaming
    @Override
    public void citySnapshot(com.google.protobuf.Empty request, StreamObserver<generated.Snapshot> responseObserver) {
//        return new StreamObserver<RouteNote>() {
//            @Override
//            public void onNext(RouteNote note) {
//                System.out.println("Request of " + note.getMessage());
//                RouteNote serverNote = RouteNote.newBuilder()
//                        .setLocation(note.getLocation())
//                        .setMessage("Respond to " + note.getMessage()).build();
//                responseObserver.onNext(serverNote);
//            }
//
//            @Override
//            public void onError(Throwable t) {
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Server side stream completed");
//                responseObserver.onCompleted();
//            }
//        };
    }

//    private List<RouteNote> getOrCreateNotes(Point location) {
//        List<RouteNote> notes = Collections.synchronizedList(new ArrayList<RouteNote>());
//        List<RouteNote> prevNotes = routeNotes.putIfAbsent(location, notes);
//        return prevNotes != null ? prevNotes : notes;
//    }
}
