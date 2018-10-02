package com.vehicleentry.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleentry.entity.Vehicle;
import com.vehicleentry.repository.VehicleRepository;

@RestController
@Controller
public class VehicleController {
	@Autowired

	VehicleRepository vehicleRepository;

	@PostMapping("/vehicle")
	public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);

	}

	@GetMapping("/vehicle/{id}")
	public Vehicle getVehicleById(@PathVariable(value = "id") Integer vehicleId) {
		return vehicleRepository.findById(vehicleId).orElseThrow(() -> new RuntimeException("cannot find student"));

	}
}
