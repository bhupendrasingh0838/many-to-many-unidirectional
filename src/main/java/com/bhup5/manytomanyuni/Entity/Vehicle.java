package com.bhup5.manytomanyuni.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int veh_id;
    private String name;

    public Vehicle() {
    }

    public Vehicle(int veh_id, String name) {
        this.veh_id = veh_id;
        this.name = name;
    }

    public int getVeh_id() {
        return veh_id;
    }

    public void setVeh_id(int veh_id) {
        this.veh_id = veh_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
