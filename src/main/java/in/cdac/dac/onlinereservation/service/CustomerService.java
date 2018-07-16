package in.cdac.dac.onlinereservation.service;

import in.cdac.dac.onlinereservation.model.Customer;
import in.cdac.dac.onlinereservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by swati on 7/16/18.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId){
        return customerRepository.findById(customerId).orElse(null);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}