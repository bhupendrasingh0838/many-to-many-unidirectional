package com.bhup5.manytomanyuni.Repository;

import com.bhup5.manytomanyuni.Entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,Integer> {
}
