package com.imcs.niks.passengerrepo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.imcs.niks.passengerrepo.entity.CreditCardDetails;


public class CreditCardDetailsDao implements IPassengerCreditCardDao {
	
	@Autowired
	private SessionFactory factory;

	public boolean saveCreditCard(CreditCardDetails cardDetails) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.save(cardDetails);
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

	public CreditCardDetails getCreditCardById(Integer id) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			CreditCardDetails card=(CreditCardDetails) session.get(CreditCardDetails.class, id);
			transaction.commit();
			return card;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteCreditCardById(Integer id) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			CreditCardDetails card=(CreditCardDetails) session.get(CreditCardDetails.class, id);
			session.delete(card);
			transaction.commit();
			return true;
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCreditCard(CreditCardDetails cardDetails) {
		Session session=factory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.update(cardDetails);
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

}
