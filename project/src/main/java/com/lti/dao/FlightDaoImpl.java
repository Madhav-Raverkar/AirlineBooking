package com.lti.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Flight;

@Repository
public class FlightDaoImpl implements FlightDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Flight addFlight(Flight f) {
		// TODO Auto-generated method stub
		em.persist(f);
		return f;
	}

	@Override
	@Transactional
	public List<Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		TypedQuery<Flight> qry = em.createQuery("Select f from Flight f",Flight.class);
		List<Flight> flightList = qry.getResultList();
		return flightList;
	}

	@Override
	@Transactional
	public List<Flight> searchFlight(String source, String destination, Date journeyDate) {
		TypedQuery<Flight> qry = em.createQuery("Select f from Flight f where f.source =:psource and f.destination =:pdestination and f.journeyDate =:pjourneyDate",Flight.class);
		qry.setParameter("psource", source);
		qry.setParameter("pdestination", destination);
		qry.setParameter("pjourneyDate", journeyDate);
		List<Flight> flightList = qry.getResultList();
		return flightList;
	}

	@Override
	@Transactional
	public boolean deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		Flight f = em.find(Flight.class,flightId);
		if(f!=null) {
			em.remove(f);
			return true;
		}
		else {
			return false;
		}
	}

}
