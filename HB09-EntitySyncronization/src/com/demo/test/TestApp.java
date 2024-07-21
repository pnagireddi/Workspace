package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Student;
import com.demo.util.JdbcUtil;

public class TestApp {

	public static void main(String[] args) {
		
		Session session=null;
		
		 
		 int id=1;

		try {
			// to get session object.
		 session = JdbcUtil.getSession();
		 Student student = session.get(Student.class, id);
		 System.out.println("Berfore DB Changes..........");
		 System.out.println(student);
		 if (session != null) {
			 System.in.read();// to change the db table information
			 session.refresh(student);
			 System.out.println("After DB Changes..........");
			 System.out.println(student);
		 }
		 
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			JdbcUtil.closeSession(session);
			JdbcUtil.closeSessionFactory();
			
			
		}
	}

}
