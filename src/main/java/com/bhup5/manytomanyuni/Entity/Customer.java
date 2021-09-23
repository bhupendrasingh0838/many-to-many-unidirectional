package com.bhup5.manytomanyuni.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_id;
    private String name;
    private String mobNumber;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Vehicle>vehicles;

    public Customer() {
    }

    public Customer(int cust_id, String name, String mobNumber, List<Vehicle> vehicles) {
        this.cust_id = cust_id;
        this.name = name;
        this.mobNumber = mobNumber;
        this.vehicles = vehicles;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
