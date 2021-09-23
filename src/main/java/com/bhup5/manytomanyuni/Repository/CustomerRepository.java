package com.bhup5.manytomanyuni.Repository;

import com.bhup5.manytomanyuni.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
