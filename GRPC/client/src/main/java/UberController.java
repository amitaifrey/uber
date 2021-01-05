import generated.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class UberController {

    private Logic logic;

    public UberController() {
        this.logic = main.logic;
    }

    @PostMapping("/ride/new")
    RideOfferResponse newOffer(@RequestBody RideOffer offer) {
        return null;
    }

    @PostMapping("/ride/request")
    RideRequestResponse newRequest(@RequestBody RideRequest request) {
        return null;
    }

//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) throws EmployeeAlreadyExistsException {
//        return repository.save(newEmployee);
//    }

    @ResponseBody
    @GetMapping("/snapshot")
    Snapshot snapshot()  {
        return null;
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