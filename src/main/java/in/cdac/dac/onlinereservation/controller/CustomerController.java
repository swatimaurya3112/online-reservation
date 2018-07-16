package in.cdac.dac.onlinereservation.controller;

import in.cdac.dac.onlinereservation.model.Customer;
import in.cdac.dac.onlinereservation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by swati on 7/16/18.
 */

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers")
    public Customer createUser(@Valid @RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/customers/{id}")
    public Customer getUserById(@PathVariable(value = "id") Long userId) {
        return customerService.getCustomerById(userId);
    }

}
