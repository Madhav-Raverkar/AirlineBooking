package com.lti.services;

import java.util.List;

import com.lti.beans.Passenger;

public interface PassengerService {
	int addPass(Passenger p);
	boolean deletePass(int pId);
	List<Passenger> PassList();
}
