package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Ticket;
import com.lti.dao.TicketDao;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDao dao;

	@Override
	public int bookTicket(Ticket t) {
		return dao.bookTicket(t);
	}
	
	
	
}
