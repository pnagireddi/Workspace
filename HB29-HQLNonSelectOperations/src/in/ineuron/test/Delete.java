package in.ineuron.test;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import in.ineuron.util.HibernateUtil;

public class Delete {
	
	

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Session session=null;
		Transaction transaction=null;
		int count=0;
		boolean flag=false;

		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			  
			 transaction =session.beginTransaction();
			 
			Query query = session.createQuery("DELETE FROM in.ineuron.model.Product WHERE pname =:p1 ");
			 

			query.setParameter("p1", "book");
			
			//Execute the query
             count= query.executeUpdate();
			 
			 flag=true;
			 
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(flag) {
				transaction.commit();
				System.out.println("NO of rows effected ::"+count);
			}
			else {
				transaction.rollback();
				System.out.println("NO of rows effected ::"+count);
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
