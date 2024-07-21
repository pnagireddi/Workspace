package com.demo.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.demo.model.InsurancePolicy;
import com.demo.util.HibernateUtil;

public class SelectQueryApp {

	public static void main(String[] args) {

		Session session = null;
		try {
			session = HibernateUtil.getSesstion();
           
			Query query = session.createQuery("from com.demo.model.InsurancePolicy ");
			
			query.setFirstResult(0);
			query.setMaxResults(1);
			
			List<InsurancePolicy> resultList = query.getResultList();
			resultList.forEach(System.out::println);
			
		} 
		catch (HibernateException he) {
			he.printStackTrace();

		}
		finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
			
		}
	}

}
