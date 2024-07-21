package in.ineuron.test;

import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;

import in.ineuron.model.Prod;
import in.ineuron.util.HibernateUtil;

public class SelectApp2 {
	
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			
			 String name="accidental";
			 ProcedureCall procedureCall = session.createStoredProcedureCall("GET_BY_NAME", Prod.class);
			 procedureCall.registerParameter(1, String.class, ParameterMode.IN).bindValue(name);
			 
			 @SuppressWarnings("unchecked")
			List<Prod> resultList = procedureCall.getResultList();
			 resultList.forEach(System.out::println);
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
