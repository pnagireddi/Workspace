package in.ineuron.test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import in.ineuron.util.HibernateUtil;

public class InsertApp {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Session session=null;
		Transaction transaction=null;
		 int rowcount=0;
		 boolean flag=false;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.createNativeQuery("insert into insurencepolices(company,pname,policytype,tenure) values (?,?,?,?)");
			 
			 //setting parameters
			 nativeQuery.setParameter(2, "Prudential");
			 nativeQuery.setParameter(3, "yearly");
			 nativeQuery.setParameter(4, 24);
			 nativeQuery.setParameter(1, "ICICI");
			 
			 
			  rowcount = nativeQuery.executeUpdate();
			  flag=true;
			 
			
		}
		 
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			
			if(flag) {
				transaction.commit();
				System.out.println("No of rows Effected is ::"+rowcount);
				
			}else {
				transaction.rollback();
				System.out.println("No of rows Effected is ::"+rowcount);
				
			}
			HibernateUtil.closeSessionFactory();
			HibernateUtil.closeSessionFactory();
		}
		
	}

}
