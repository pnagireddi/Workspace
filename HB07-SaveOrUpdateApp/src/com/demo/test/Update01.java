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
			 student.setSid(9);
			 student.setSname("Venkateshwara");
			 student.setSaddress("TDD");
			 student.setSage(99);
			 
			 session.saveOrUpdate(student);
			 
			 flag=true;
			 
		}
		
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
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
