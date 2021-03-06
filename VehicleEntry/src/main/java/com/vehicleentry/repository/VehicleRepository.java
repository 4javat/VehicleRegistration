package com.vehicleentry.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vehicleentry.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
