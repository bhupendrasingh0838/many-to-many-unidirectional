package com.bhup5.manytomanyuni.Service;

import com.bhup5.manytomanyuni.Entity.Vehicle;
import com.bhup5.manytomanyuni.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImp implements VehicleService {
    
    @Autowired
    VehicleRepository repository1;

    @Override
    public List<Vehicle> getAllVehicle() {
        return (List<Vehicle>) repository1.findAll();
    }

    @Override
    public Vehicle getVehicle(int veh_id) {
        return repository1.findById(veh_id).get();
    }

    @Override
    public String createVehicle(Vehicle vehicle) {
        repository1.save(vehicle);
        return "Data Created";
    }

    @Override
    public void deleteVehicle(int veh_id) {
        repository1.deleteById(veh_id);

    }

    @Override
    public Vehicle updateVehicle(int veh_id, Vehicle vehicle) {
        Vehicle vehicle1 = repository1.findById(veh_id).get();
        vehicle1.setName(vehicle.getName());
        repository1.save(vehicle1);
        return vehicle1;
    }
}
