package rpc;
import com.google.protobuf.Empty;
import generated.UberServiceGrpc;
import io.grpc.stub.StreamObserver;
import logic.Logic;
import generated.Result;
import generated.CitySnapshot;
import generated.RideOffer;
import generated.CommitRequest;
import generated.City;
import generated.RidePlanRequest;
import generated.PlanRideOffers;
import generated.State;
import java.util.HashMap;

public class UberService extends UberServiceGrpc.UberServiceImplBase {

    private HashMap<String, Logic> logics;

    public UberService(HashMap<String, Logic> logics) {
        this.logics = logics;
    }

    @Override
    public void addRideOffer(RideOffer offer, StreamObserver<Empty> responseObserver) {
        var logic = logics.get(offer.getRide().getStartingPosition());
        try {
            if (!logic.IsRideOfferExists(offer)) {
                logic.AddRideToStorage(offer);
                logic.BroadcastNewRide(offer);
            }
        } catch (Exception ignored) {}
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void addRemoteRide(RideOffer offer, StreamObserver<RideOffer> responseObserver) {
        var logic = logics.get(offer.getRide().getStartingPosition());
        try {
            var result = logic.NewRide(offer);
            responseObserver.onNext(result);
        } catch (Exception ignored) {}
        responseObserver.onCompleted();
    }

    @Override
    public void lockRide(RideOffer offer, StreamObserver<Result> responseObserver) {
        var logic = logics.get(offer.getRide().getStartingPosition());
        boolean result = logic.LockRide(offer);

        try {
            if (result) logic.BroadcastLockRide(offer);
        } catch (Exception ignored) {}

        responseObserver.onNext(Result.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void commitRide(CommitRequest req, StreamObserver<Result> responseObserver) {
        var logic = logics.get(req.getOffer().getRide().getStartingPosition());
        boolean result = logic.CommitRide(req);

        try {
            if (result) logic.BroadcastCommitRide(req);
        } catch (Exception ignored) {}

        responseObserver.onNext(Result.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void requestRide(RidePlanRequest req, StreamObserver<PlanRideOffers> responseObserver) {
        var logic = logics.get(req.getCity());
        var plan = logic.GetSuitableRides(req.getRequest());
        responseObserver.onNext(plan);
        responseObserver.onCompleted();
    }

    @Override
    public void getCitySnapshot(City city, StreamObserver<CitySnapshot> responseObserver) {
        var logic = logics.get(city.getName());
        responseObserver.onNext(logic.GetCitySnapshot());
        responseObserver.onCompleted();
    }

    @Override
    public void requestState(generated.StateRequest req, StreamObserver<Empty> responseObserver) {
        var logic = logics.get(req.getCity().getName());
        logic.SendState(req);
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    public void setState(State state, StreamObserver<Empty> responseObserver) {
        var logic = logics.get(state.getCity().getName());
        logic.SetState(state.getData());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}
