package com.vehicleentry.service;

import java.util.List;

import com.vehicleentry.entity.Vehicle;

public interface VehicleService {

	List<Vehicle> listVehicle();
	void saveAll(List<Vehicle> vehicle);
	void save(Vehicle vehicle);
}
