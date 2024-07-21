package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Student;
import com.demo.util.JdbcUtil;

public class SaveApp {

	public static void main(String[] args) {
		
		Session session=null;
		 Transaction transaction =null;
		 boolean flag=false;
		 Integer id=null;

		try {
			// to get session object.
		 session = JdbcUtil.getSession();
		 
		 if (session != null) 
				//begin transaction as non select operation.
		 transaction = session.beginTransaction();
		 
		 if (transaction != null) {
			//create persistence object.
			 Student student = new Student();
			 student.setSid(5);
			 student.setSname("Spandhana");
			 student.setSaddress("HYD");
			 student.setSage(25);
			 
			  id=(Integer)session.save(student);
			 
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
				System.out.println("Record saved sucess..with the ID OF::"+id);
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
