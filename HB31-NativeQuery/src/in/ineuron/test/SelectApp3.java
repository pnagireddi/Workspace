package in.ineuron.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import in.ineuron.util.HibernateUtil;

public class SelectApp3 {
	
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			 
			
			 NativeQuery nativeQuery = session.createNativeQuery("select pid,pname,company from insurencepolices where tenure >=? and tenure <=?");
			 
			 //setting parameters
			 nativeQuery.setParameter(1, 15);
			 nativeQuery.setParameter(2, 35);
			 
			 //binding the data type of output parameter
			 nativeQuery.addScalar("pid",StandardBasicTypes.INTEGER);
			 nativeQuery.addScalar("pname",StandardBasicTypes.STRING);
			 nativeQuery.addScalar("company",StandardBasicTypes.STRING);
			 
			// executing Query
			  @SuppressWarnings("unchecked")
			List<Object[]> lists = nativeQuery.getResultList();
			  
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
