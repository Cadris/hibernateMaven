package com.sayan.hibernateProject.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sayan.hibernateProject.models.Address;

public class AddressService {

	public boolean save(Address address, SessionFactory sessionFactory) throws Exception {
		Session session = sessionFactory.openSession();
		
		// Begin Transction
		Transaction transaction = session.beginTransaction();
		session.save(address);
		transaction.commit();
		
		//End Session
		session.close();
		
		return true;
	}
	
}
