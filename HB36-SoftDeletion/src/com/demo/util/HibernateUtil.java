package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.AccountDetails;

public class HibernateUtil {
	
	 static SessionFactory sessionFactory=null;
	 static Session session=null;
	
	private HibernateUtil() {
		
	}
	
	static {
	  sessionFactory = new Configuration().configure().addAnnotatedClass(AccountDetails.class).buildSessionFactory();
	}
	
	public static Session getSesstion() {
		if (session == null) {
			
			session=sessionFactory.openSession();
			
		}
		return session;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory !=null) {
			sessionFactory.close();
		}
	}
	
	public static void closeSession(Session session) {
		if(session !=null){
			session.close();
		}
	}

}
