package com.vehicleentry.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vehicleentry.entity.Vehicle;
import com.vehicleentry.repository.VehicleRepository;

@Component
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;
	
	
	
	@Override
	public List<Vehicle> listVehicle() {
		List<Vehicle> v= new ArrayList<>();
		vehicleRepository.findAll().forEach(v:: add);
		return v;
	}

	@Override
	public void saveAll(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

}
