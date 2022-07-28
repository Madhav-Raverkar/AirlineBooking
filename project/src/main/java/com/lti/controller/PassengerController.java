package com.lti.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Passenger;
import com.lti.services.PassengerService;

@CrossOrigin
@RestController
@RequestMapping("/passenger-api")
public class PassengerController {

	@Autowired
	PassengerService service;
	
	@PostMapping("/addpassenger")
	public int addPass(@RequestBody Passenger p) {
		System.out.println("passenger add");
		int pass=service.addPass(p);
		return pass;
	}
	
	@PostMapping("/deletepassenger")
	public boolean deletePass() {
		return false;
	}

	@GetMapping("/viewpass")
	public List<Passenger> viewPass(){
		List<Passenger> passList = service.PassList();
		return passList;
	}
}
