package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Student;
import com.demo.util.JdbcUtil;

public class GetApp {

	public static void main(String[] args) {
		
		Session session=null;
		int id=3;

		try {
			// to get session object.
		 session = JdbcUtil.getSession();
		 
		 if (session != null) {
			Student student = session.get(Student.class, id);
			if(student !=null) {
				System.out.println(student);
			}
			else {
				System.out.println("Record is not avilable on given ID::"+id);
			}
		
		 
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
