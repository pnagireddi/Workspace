package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.ineuron.model.InsurencePolicies;
import in.ineuron.util.HibernateUtil;

public class SelectApp2 {
	
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.createNativeQuery("select * from insurencepolices where tenure >=:min and tenure <=:max");
			 
			 //setting parameters
			 nativeQuery.setParameter("min", 15);
			 nativeQuery.setParameter("max", 35);
			 
			 // mapping result with entity class
			 nativeQuery.addEntity(InsurencePolicies.class);
			 
			// executing Query
			List<InsurencePolicies> lists = nativeQuery.getResultList();
			 
			//process the result
			lists.forEach(System.out::println);
			
			 
			
		}
		 
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			HibernateUtil.closeSessionFactory();
			HibernateUtil.closeSessionFactory();
		}
		
	}

}
