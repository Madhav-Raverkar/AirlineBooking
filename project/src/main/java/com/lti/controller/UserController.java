package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.UserRegister;
import com.lti.services.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user-api")
public class UserController {
	
	
	@Autowired
	UserService service;
	
	
//	http://localhost:8090/user-api/adduser
	@PostMapping("/adduser")
	public int addUser(@RequestBody UserRegister e){
		int userId=service.addUser(e);
		System.out.println("Hello World"+e);
		return userId;
	}
	
//	http://localhost:8091/user-api/viewallflight
	@GetMapping("/viewallflight")
	public int viewAllFlight() {
		int flightList = 1;
		return flightList;
	}

}
