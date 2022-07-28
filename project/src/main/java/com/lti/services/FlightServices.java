package com.lti.services;

import java.util.List;

import com.lti.beans.Flight;

public interface FlightServices {
	public Flight addFlight(Flight f);
	public List<Flight> searchFlight(Flight f);
	public List<Flight> viewAllFlight();
	public boolean deleteFlight(int flightId);

}
