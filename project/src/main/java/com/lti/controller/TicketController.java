package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ticket;
import com.lti.services.TicketService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("ticket-api/")
public class TicketController {
	
	@Autowired
	TicketService service;
	
	//http://localhost:8090/ticket-api/addticket
	@PostMapping(path = "/addticket")
	public int addTicket(@RequestBody Ticket t) {
		int fid = service.bookTicket(t);
		return fid;
	}
	
	
	
}
