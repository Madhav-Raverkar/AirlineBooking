package com.lti.dao;

import java.util.Date;
import java.util.List;

import com.lti.beans.Flight;

public interface FlightDao {
	public Flight addFlight(Flight f);
	public List<Flight> viewAllFlight();
	public List<Flight> searchFlight(String source,String destination,Date journeyDate);
	public boolean deleteFlight(int flightId);
}
