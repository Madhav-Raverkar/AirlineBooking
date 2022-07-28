package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Flight;
import com.lti.services.FlightServices;

@CrossOrigin
@RestController
@RequestMapping("/flight-api")
public class FlightController {

	@Autowired
	FlightServices service;
	
	
	//http://localhost:8090/flight-api/addflight
	@PostMapping("/addflight")
	public Flight addFight(@RequestBody Flight f) {
		System.out.println("Journey"+f.getJourneyDate());
		Flight flight = service.addFlight(f);
		return flight;
	}
	
	//http://localhost:8090/flight-api/searchflight
	@PutMapping("/searchflight")
	public List<Flight> searchFight(@RequestBody Flight f) {
		List<Flight> flightList = service.searchFlight(f);
		return flightList;
	}
	
	@GetMapping("/viewallflight")
	public List<Flight> viewAllFlight() {
		List<Flight> flightList = service.viewAllFlight();
		return flightList;
	}
	
	@PostMapping("/deleteflight/{pid}")
	public boolean deleteFlight(@PathVariable("pid") int flightId) {
		boolean del = service.deleteFlight(flightId);
		return del;		
	}
}
