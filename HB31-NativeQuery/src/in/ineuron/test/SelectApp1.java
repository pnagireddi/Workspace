package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.ineuron.util.HibernateUtil;

public class SelectApp1 {
	
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.createNativeQuery("select * from insurencepolices where tenure >=? and tenure <=?");
			 
			 //setting parameters
			 nativeQuery.setParameter(1, 15);
			 nativeQuery.setParameter(2, 35);
			 
			// executing Query
			  @SuppressWarnings("unchecked")
			List<Object[]> lists = nativeQuery.getResultList();
			  
			System.out.println("pid\tpname\tpolicytype\ttenure\tcompany");
			  //proceesing the result
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
