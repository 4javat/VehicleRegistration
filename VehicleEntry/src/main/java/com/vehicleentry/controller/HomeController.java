package com.vehicleentry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vehicleentry.entity.Vehicle;
import com.vehicleentry.service.VehicleService;

@Controller
public class HomeController {

	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/showvehicle")
	public String showPage(Model model) {
		model.addAttribute("data", vehicleService.listVehicle());
		return "index";
				
	}
	
//	@GetMapping("/AddVehicle.html")
//	public String showPage1(Model model) {
//		return "AddVehicle";
//		
//	}
//	
//	@PostMapping("/save")
//	public String saveVehicle(@ModelAttribute Vehicle vhe) {
//		vehicleService.save(vhe);
//		return "redirect:/showvehicle"
//	}
//	
}
