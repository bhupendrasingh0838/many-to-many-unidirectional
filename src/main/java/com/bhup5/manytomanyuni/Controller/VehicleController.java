package com.bhup5.manytomanyuni.Controller;

import com.bhup5.manytomanyuni.Entity.Vehicle;
import com.bhup5.manytomanyuni.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleService service1;

    @GetMapping("/getVehicle")
    public List<Vehicle> getAllVehicle(){
        return  (List<Vehicle>) service1.getAllVehicle();
    }
    @GetMapping("/getVehicle/{veh_id}")
    public Vehicle getVehicle(@PathVariable int veh_id){
        Vehicle vehicle = service1.getVehicle(veh_id);
        return vehicle;
    }
    @PostMapping("/createVehicle")
    public String createVehicle(@RequestBody Vehicle vehicle){
        service1.createVehicle(vehicle);
        return "Data Added Successfully";
    }
    @DeleteMapping("/deleteVehicle/{veh_id}")
    public String deleteVehicle(@PathVariable int veh_id){
        service1.deleteVehicle(veh_id);
        return "Data Deleted by id";
    }
    @PutMapping("/updateVehicle/{veh_id}")
    public Vehicle updateVehicle(@PathVariable int veh_id,@RequestBody Vehicle vehicle){
        service1.updateVehicle(veh_id,vehicle);
        return vehicle;
    }

}
