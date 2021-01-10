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
        responseObserver.onCompleted();
    }

    public void lockRide(RideOffer offer, StreamObserver<Result> responseObserver) {
        var logic = logics.get(offer.getRide().getStartingPosition());
        boolean result = false;
        if (logic.IsRideOfferExists(offer)) {
            if (!logic.IsLocked(offer) && logic.HasVacancies(offer)) {
                logic.LockRide(offer);
                result = true;
            }
        }

        try {
            if (result) logic.BroadcastLockRide(offer);
        } catch (Exception ignored) {}

        responseObserver.onNext(Result.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }

    @Override
    public void commitRide(CommitRequest req, StreamObserver<Result> responseObserver) {
        var logic = logics.get(req.getOffer().getRide().getStartingPosition());
        boolean result = false;
        if (logic.IsRideOfferExists(req.getOffer())) {
            if (logic.IsLocked(req.getOffer())) {
                logic.CommitRide(req);
                result = true;
            }
        }

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
}
