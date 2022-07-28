package com.lti.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Passenger;
import com.lti.dao.PassengerDao;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerDao dao;

	@Override
	public int addPass(Passenger p) {
		return dao.addPass(p);
	}

	@Override
	public boolean deletePass(int pId) {
		// TODO Auto-generated method stub
		return dao.deletePass(pId);
	}

	@Override
	public List<Passenger> PassList() {
		// TODO Auto-generated method stub
		return dao.passList();
	}
	
}
