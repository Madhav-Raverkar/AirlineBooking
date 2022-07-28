package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.UserRegister;
import com.lti.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao dao;
	
	@Override
	public int addUser(UserRegister u) {
		System.out.println("service layer");
	    return dao.addUser(u);
	
	}
}
