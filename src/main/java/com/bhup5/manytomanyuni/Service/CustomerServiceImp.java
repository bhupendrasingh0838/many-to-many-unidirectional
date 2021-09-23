package com.bhup5.manytomanyuni.Service;

import com.bhup5.manytomanyuni.Entity.Customer;
import com.bhup5.manytomanyuni.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getAllCustomer() {
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getCustomer(int cust_id) {
        return repository.findById(cust_id).get();
    }

    @Override
    public String createCustomer(Customer customer) {
        repository.save(customer);
        return "Data Created";
    }

    @Override
    public void deleteCustomer(int cust_id) {
        repository.deleteById(cust_id);

    }

    @Override
    public Customer updateCustomer(int cust_id, Customer customer) {
        Customer customer1  = repository.findById(cust_id).get();
        customer1.setName(customer.getName());
        customer1.setMobNumber(customer.getMobNumber());
        repository.save(customer1);
        return customer1;
    }
}
