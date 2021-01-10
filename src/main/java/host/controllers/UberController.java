package host.controllers;
import com.google.protobuf.util.JsonFormat;
import host.main;
import logic.Logic;
import org.apache.zookeeper.KeeperException;
import org.springframework.web.bind.annotation.*;
import generated.RideOffer;
import generated.RideRequest;

import java.util.HashMap;


@RestController
public class UberController {

    private HashMap<String, Logic> logics;

    public UberController() {
        this.logics = main.logics;
    }

    @PostMapping("/ride/new")
    String newOffer(@RequestBody String offer) throws KeeperException, InterruptedException {
        System.out.println(offer);
        var builder = RideOffer.newBuilder();
        try {
            JsonFormat.parser().ignoringUnknownFields().merge(offer, builder);
        } catch(Exception e) {
            System.out.println(":(");
            System.out.println(e);
        }
        var rideOffer = builder.build();
        return logics.get(rideOffer.getRide().getStartingPosition()).NewRide(rideOffer).toString();
    }

    @PostMapping("/ride/request")
    String newRequest(@RequestBody String req) {
        var builder = RideRequest.newBuilder();
        try {
            JsonFormat.parser().ignoringUnknownFields().merge(req, builder);
        } catch(Exception e) {
            System.out.println(":(");
            System.out.println(e);
        }
        var request = builder.build();
        return logics.get("city1").PlanRide(request);
    }

    @ResponseBody
    @GetMapping("/snapshot")
    String snapshot()  {
        return logics.get("city1").GetSnapshot().toString();
    }
}