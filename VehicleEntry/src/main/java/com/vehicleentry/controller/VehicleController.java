package com.vehicleentry.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleentry.entity.Vehicle;
import com.vehicleentry.repository.VehicleRepository;

@RestController
@Controller
@Component
public class VehicleController {
	@Autowired

	VehicleRepository vehicleRepository;

	
	@PostMapping("/vehicle")
	public Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);

	}

	@GetMapping("/vehicle/{id}")
	public Vehicle getVehicleById(@PathVariable(value = "id") Integer vehicleId) {
		return vehicleRepository.findById(vehicleId).orElseThrow(() -> new RuntimeException("cannot find vehicle"));

	}
	@DeleteMapping("/vehicle/{id}")
	public void deleteVehicleById(@PathVariable Integer id) {
		 vehicleRepository.deleteById(id);
	}
	@PutMapping("/vehicle/{id}")
	public ResponseEntity<Object> updateVehicle(@RequestBody Vehicle vehicle,@PathVariable(value="id") Integer id){
		Optional<Vehicle> vehicle2= vehicleRepository.findById(id);
		if (!vehicle2.isPresent()) {
			return ResponseEntity.badRequest().build();
			
		}
		vehicle.setId(id);
	   Vehicle vehicleUpdated =vehicleRepository.save(vehicle);
	    return ResponseEntity.ok().body(vehicleUpdated);
	}
}
