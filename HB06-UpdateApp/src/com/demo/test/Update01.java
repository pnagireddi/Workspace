package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.Student;
import com.demo.util.JdbcUtil;

public class Update01 {

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
			 student.setSid(1);
			 student.setSname("Nagi");
			 student.setSaddress("GPL");
			 student.setSage(27);
			 
			 session.update(student);
			 
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
				System.out.println("Record update sucess..");
			}
			else {
				transaction.rollback();
				System.out.println("record not updated..");
			}
			
			JdbcUtil.closeSession(session);
			JdbcUtil.closeSessionFactory();
			
			
		}
	}

}
