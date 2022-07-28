package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.UserRegister;

@Repository

public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int addUser(UserRegister u) {
	    System.out.println(" inside dao layer"+u);
	    em.persist(u);
	    return u.getUserId();
	}
}

