package host.controllers;
import com.google.protobuf.util.JsonFormat;
import host.main;
import logic.Logic;
import org.apache.zookeeper.KeeperException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import generated.RideOffer;
import generated.RideRequest;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.stream.Collectors;


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
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Format is incorrect", e);
        }
        var rideOffer = builder.build();

        if (!logics.containsKey(rideOffer.getRide().getStartingPosition())) {
            return logics.values().stream().collect(Collectors.toList()).get(0).NewRemoteRide(rideOffer).toString();
        }
        var result = logics.get(rideOffer.getRide().getStartingPosition()).NewRide(rideOffer).toString();
        if (result.equals("")) {
            System.out.println(":( #2");
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not register new ride");
        }
        return result;
    }

    @PostMapping("/ride/request")
    String newRequest(@RequestBody String req) {
        var builder = RideRequest.newBuilder();
        try {
            JsonFormat.parser().ignoringUnknownFields().merge(req, builder);
        } catch(Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Format is incorrect", e);
        }
        var request = builder.build();
        var result =  logics.values().stream().collect(Collectors.toList()).get(0).PlanRide(request);
        if (result.equals("")) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not register new request");
        }
        return result;
    }

    @ResponseBody
    @GetMapping("/snapshot")
    String snapshot()  {
        var result = logics.values().stream().collect(Collectors.toList()).get(0).GetSnapshot().toString();
        if (result.equals("")) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not get system snapshot");
        }
        return result;
    }
}