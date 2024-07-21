package in.ineuron.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.Product;
import in.ineuron.util.HibernateUtil;

public class Test1 {
	
	

	public static void main(String[] args) {
		
		Session session=null;

		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			
			 //prepare the query object to hold HQL query.
			 @SuppressWarnings("unchecked")
			Query<Product> query = session.createQuery("FROM in.ineuron.model.Product");
			 
			 //Execute the query
			 List<Product> products = query.list();
			 
			 //process the list of objects
			 products.forEach(System.out::println);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
