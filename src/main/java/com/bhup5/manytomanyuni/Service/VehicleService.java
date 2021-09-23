package com.bhup5.manytomanyuni.Service;

import com.bhup5.manytomanyuni.Entity.Vehicle;

import java.util.List;

public interface VehicleService {

    public List<Vehicle> getAllVehicle();

    public Vehicle getVehicle(int veh_id);

    public String createVehicle(Vehicle vehicle);

    public void deleteVehicle(int veh_id);

    public Vehicle updateVehicle(int veh_id,Vehicle vehicle);
}
