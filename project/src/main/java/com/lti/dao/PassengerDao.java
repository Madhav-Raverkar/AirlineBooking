package com.lti.dao;

import java.util.List;

import com.lti.beans.Passenger;

public interface PassengerDao {
	int addPass(Passenger p);
	boolean deletePass(int pId);
	List<Passenger> passList();
}
