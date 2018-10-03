package com.vehicleentry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="vehicles")
@Component
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String make;
	private String model;
	private int year;
	private String vehiclePlate;
	private String engine;
	
		
	public Vehicle() {
		super();
	}

	public Vehicle(int id, String make, String model, int year, String vehiclePlate, String engine) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.vehiclePlate = vehiclePlate;
		this.engine = engine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	
	
	
	
	
}
