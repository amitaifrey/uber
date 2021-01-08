package host.controllers;
import com.google.protobuf.util.JsonFormat;
import host.main;

import logic.Logic;
import org.apache.zookeeper.KeeperException;
import org.springframework.web.bind.annotation.*;

import generated.RideOffer;
import generated.RideOfferResponse;
import generated.RideRequest;
import generated.RideRequestResponse;
import generated.Snapshot;

@RestController
public class UberController {

    private final Logic logic;

    public UberController() {
        this.logic = main.logic;
    }

    @PostMapping("/ride/new")
    String newOffer(@RequestBody String offer) {
        System.out.println(offer);
        var builder = RideOffer.newBuilder();
        try {
            JsonFormat.parser().ignoringUnknownFields().merge(offer, builder);
        } catch(Exception e) {
            System.out.println(":(");
            System.out.println(e);
        }
        var rideOffer = builder.build();
        return logic.NewRide(rideOffer).toString();
    }

    @PostMapping("/ride/request")
    String newRequest(@RequestBody RideRequest request) {
        return "";
    }

//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) throws EmployeeAlreadyExistsException {
//        return repository.save(newEmployee);
//    }

    @ResponseBody
    @GetMapping("/snapshot")
    String snapshot()  {
        return logic.GetSnapshot().toString();
    }

//    @ResponseBody
//    @PutMapping("/employees/{id}")
//    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) throws EmployeeAlreadyExistsException {
//        return repository.saveOrSwitch(newEmployee,id);
//    }
//
//    @ResponseBody
//    @DeleteMapping("/employees/{id}")
//    Employee deleteEmployee(@PathVariable Long id) {
//        Employee employee = one(id);
//        repository.delete(employee);
//        return employee;
//    }
}