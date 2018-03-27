package com.imcs.niks.passengerrepo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.imcs.niks.passengerrepo.entity.PassengerProfile;

@Repository
public class PassengerDao implements IPassengerDao {
	@Autowired
	private SessionFactory factory;

	public boolean savePassenger(PassengerProfile p) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.save(p);
			transaction.commit();
			return true;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
		finally{
			session.close();
		}

	}

	public PassengerProfile getPassengerById(Integer id) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			PassengerProfile passenger=(PassengerProfile) session.get(PassengerProfile.class, id);
			transaction.commit();
			return passenger;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return null;
		}
	}
	

	public boolean deletePassengerById(Integer id) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			PassengerProfile passenger=(PassengerProfile) session.get(PassengerProfile.class, id);
			session.delete(passenger);
			transaction.commit();
			return true;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return false;
		}

	}

	public boolean updatePassenger(PassengerProfile p) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.update(p);
			transaction.commit();
			return true;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
		finally{
			session.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<PassengerProfile> getAllPassengers() {
		Session session=factory.getCurrentSession();
		String hql="from PassengerProfile";
		Query query=(Query) session.createQuery(hql);
		List<PassengerProfile> passengers=query.getResultList();
		if(passengers.size()>0){
			return passengers;
		}
		else{
			return null;
		}
		
	}

}
