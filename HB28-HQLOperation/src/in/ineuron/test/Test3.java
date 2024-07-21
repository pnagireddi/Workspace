package in.ineuron.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.Product;
import in.ineuron.util.HibernateUtil;

public class Test3 {
	
	

	public static void main(String[] args) {
		
		Session session=null;

		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			
			 //prepare the query object to hold HQL query.
			 @SuppressWarnings("unchecked")
			Query<Object[]> query = session.createQuery("SELECT price,qnty FROM in.ineuron.model.Product WHERE pname IN(:prod1,:prod2)");
			 
			 query.setParameter("prod1", "book");
			 query.setParameter("prod2", "pen");
			 
			 //Execute the query(select price ,qnty from the table where pname in("book","pen"))
			 List<Object[]> products = query.list();
			 
			 System.out.println("PRICE\tQNTY");
			 
			 //process the list of objects
				
				  products.forEach(row->{
					  for(Object obj:row) 
					  {
						  System.out.print(obj+"\t");
					  }
				  System.out.println();
				  });
				 
			 
			/* for (Object[] objects : products) {
				for(Object obj:objects) {
					System.out.print(obj+"\t");
				}
				System.out.println();
		*/	}
		
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
