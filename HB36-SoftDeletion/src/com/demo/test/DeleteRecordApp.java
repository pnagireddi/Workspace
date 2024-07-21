package com.demo.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.AccountDetails;
import com.demo.util.HibernateUtil;

public class DeleteRecordApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag=false;
		try {
			session = HibernateUtil.getSesstion();

			transaction = session.beginTransaction();

			AccountDetails account = new AccountDetails();
			account.setAccno(1234);
			session.delete(account);
			flag=true;
		} 
		catch (HibernateException he) {
			he.printStackTrace();

		}
		finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object status changed to closed/blocked==> soft deletion");
			}
			else {
				transaction.rollback();
				System.out.println("object status not changed");
			}
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
			
		}
	}

}
