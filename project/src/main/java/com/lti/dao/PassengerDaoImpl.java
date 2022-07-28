package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.lti.beans.Passenger;


@Repository
public class PassengerDaoImpl implements PassengerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addPass(Passenger p) {
		em.persist(p);
		return 1;
	}

	@Override
	public boolean deletePass(int pId) {
		// TODO Auto-generated method stub
		Passenger p1=em.find(Passenger.class, pId);
		if(p1!=null) {
			em.remove(p1);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Passenger> passList(){
		TypedQuery<Passenger> qry = em.createQuery("select p from Passenger p",Passenger.class);
		List<Passenger> passList=qry.getResultList();
		return passList;
	}
}
