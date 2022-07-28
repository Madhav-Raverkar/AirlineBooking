package com.lti.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Flight;
import com.lti.dao.FlightDao;

@Service
public class FlightServicesImpl implements FlightServices {

	@Autowired
	FlightDao dao;
	
	@Override
	public Flight addFlight(Flight f) {
		// TODO Auto-generated method stub
		return dao.addFlight(f);
	}

	@Override
	public List<Flight> viewAllFlight() {
		// TODO Auto-generated method stub
		return dao.viewAllFlight();
	}

	@Override
	public List<Flight> searchFlight(Flight f) {
		// TODO Auto-generated method stub
		String source = f.getSource();
		String destination = f.getDestination();
		Date journeyDate = f.getJourneyDate();
		
		return dao.searchFlight(source, destination, journeyDate);
	}

	@Override
	public boolean deleteFlight(int flightId) {
		// TODO Auto-generated method stub
		return dao.deleteFlight(flightId);
	}
	

}
