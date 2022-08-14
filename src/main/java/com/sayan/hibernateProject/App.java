package com.sayan.hibernateProject;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sayan.hibernateProject.models.Address;
import com.sayan.hibernateProject.models.Student;
import com.sayan.hibernateProject.services.AddressService;
import com.sayan.hibernateProject.services.StudentServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory);
        
        // Set The Services
        StudentServices studentServices = new StudentServices();
        AddressService addressService = new AddressService();
        
        // Set Object
        Student student = new Student("Sayan", "Kolkata");
        Address address = new Address("Street Value", "Kolkata", true, 55, new Date());
        
        try {
        	studentServices.save(student, sessionFactory);
        	addressService.save(address, sessionFactory);
        	
			System.out.println(student+"\n"+address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("\nProgram End\n");
        
    }
}
