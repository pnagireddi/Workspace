package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import in.ineuron.util.HibernateUtil;

public class SelectApp4 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.createNativeQuery("select pname from insurencepolices where tenure >=? and tenure <=?");
			 
			 //setting parameters
			 nativeQuery.setParameter(1, 15);
			 nativeQuery.setParameter(2, 35);
			 
			 
			 
			// executing Query
			List<String> lists = nativeQuery.getResultList();
			  
			  //proceesing the result
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
