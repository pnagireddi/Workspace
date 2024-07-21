package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.ineuron.model.InsurencePolicies;
import in.ineuron.util.HibernateUtil;

public class SelectApp2 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.getNamedNativeQuery("GET_POLICES_USE_POLICYTYPE");
			 
			 //setting parameters
			 nativeQuery.setParameter(1, "yearly");
			 
		 
			// executing Query
		List<Object[]> lists = nativeQuery.getResultList();
			 
		System.out.println("pid\tpname\t\ttenure");
			//process the result
			lists.forEach(row->{
				for (Object obj : row) {
					System.out.print(obj+"\t");
				}
				System.out.println();
			});
			
			 
			
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
