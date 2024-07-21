package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class JdbcUtil {
	
	public static SessionFactory sessionFactory=null;
	public static Session session=null;
	
	//TO prevent from object creation.
	private JdbcUtil() {
		
	}
	static {	
		sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}

	public static Session getSession() {
		if(session==null) 
			session	=sessionFactory.openSession();
		
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null)
			sessionFactory.close();
	}
	
}
