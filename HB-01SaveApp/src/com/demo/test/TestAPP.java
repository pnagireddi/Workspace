package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class TestAPP {

	public static void main(String[] args) {

		//Inform JVM to activate HIBERNATE
		Configuration configuration = new Configuration();
		configuration.configure();
		
		//creating session factory object to hold other objects required or HIBERNATE
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//using session factory object, get only one session object to perform our persistence operation
		Session session = sessionFactory.openSession();
		
		//begin transaction as non select operation.
		Transaction transaction = session.beginTransaction();
		
		//create persistence object.
		Student student = new Student();
		student.setSid(10);
		student.setSname("Nagireddy");
		student.setSaddress("HYD");
		student.setSage(27);
		
		//Perform persistence operation using Model/POJO/ENTITY object
		session.save(student);
		
		//Generate query and send to database for execution.
		transaction.commit();
		
		System.out.println("Object saved successfully..");
		
	}

}
