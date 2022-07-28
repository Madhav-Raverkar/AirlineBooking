package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int bookTicket(Ticket t) {
		em.persist(t);
		return t.getTicketId();
	}
	
}
