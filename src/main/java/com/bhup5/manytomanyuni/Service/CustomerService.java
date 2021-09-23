package com.bhup5.manytomanyuni.Service;

import com.bhup5.manytomanyuni.Entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomer();

    public Customer getCustomer(int cust_id);

    public String createCustomer(Customer customer);

    public void deleteCustomer(int cust_id);

    public Customer updateCustomer(int cust_id,Customer customer);
}
