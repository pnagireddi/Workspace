package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Student;
import com.demo.util.JdbcUtil;

public class PersistApp {

	public static void main(String[] args) {
		
		Session session=null;
		 Transaction transaction =null;
		 boolean flag=false;

		try {
			// to get session object.
		 session = JdbcUtil.getSession();
		 
		 if (session != null) 
				//begin transaction as non select operation.
		 transaction = session.beginTransaction();
		 
		 if (transaction != null) {
			//create persistence object.
			 Student student = new Student();
			 student.setSid(18);
			 student.setSname("Nagireddy");
			 student.setSaddress("HYD");
			 student.setSage(27);
			 
			 //here persist method will return void . which JPA specific method.
			 session.persist(student);
			 
			 flag=true;
			 
		}
		
		}
		catch(HibernateException he) {
			
		}
		catch(Exception e) {
			
		}
		finally {
			
			if (flag==true) {
				transaction.commit();
				System.out.println("Record saved sucess..");
			}
			else {
				transaction.rollback();
				System.out.println("record not saved..");
			}
			
			JdbcUtil.closeSession(session);
			JdbcUtil.closeSessionFactory();
			
			
		}
	}

}
