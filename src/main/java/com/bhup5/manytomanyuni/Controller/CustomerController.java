package com.bhup5.manytomanyuni.Controller;

import com.bhup5.manytomanyuni.Entity.Customer;
import com.bhup5.manytomanyuni.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;
    @GetMapping("/getCustomer")
    public List<Customer> getAllCustomer(){
        return (List<Customer>) service.getAllCustomer();
    }

    @GetMapping("/getCustomer/{cust_id}")
    public Customer getCustomer(@PathVariable int cust_id){
        Customer customer=service.getCustomer(cust_id);
        return customer;
    }
    @PostMapping("/createCustomer")
    public String createCustomer(@RequestBody Customer customer){
        service.createCustomer(customer);
        return "Data Added Successfully";
    }
    @DeleteMapping("/deleteCustomer/{cust_id}")
    public String deleteCustomer(@PathVariable int cust_id){
        service.deleteCustomer(cust_id);
        return "Data Deleted Successfully";
    }
    @PutMapping("/updateCustomer/{cust_id}")
    public Customer updateCustomer(@PathVariable int cust_id,@RequestBody Customer customer){
        service.updateCustomer(cust_id,customer);
        return customer;
    }
}
