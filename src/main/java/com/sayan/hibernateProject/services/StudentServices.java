package com.sayan.hibernateProject.services;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sayan.hibernateProject.models.Student;

public class StudentServices {

	public boolean save(Student student, SessionFactory sessionFactory) throws Exception {
		Session session = sessionFactory.openSession();
		
		// Begin Transction
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		
		//End Session
		session.close();
		
		return true;
	}
	
}
