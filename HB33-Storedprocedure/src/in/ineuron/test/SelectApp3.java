package in.ineuron.test;

import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;

import in.ineuron.model.Prod;
import in.ineuron.util.HibernateUtil;

public class SelectApp3 {
	
	public static void main(String[] args) {
		
		Session session=null;;
		
		try {
		 session = HibernateUtil.getSession();
		 if (session != null) {
			
			 int id=1;
			 ProcedureCall procedureCall = session.createStoredProcedureCall("GET_POLICIES_BY_ID");
			 procedureCall.registerParameter(1, Integer.class, ParameterMode.IN).bindValue(id);
			 procedureCall.registerParameter(2, String.class, ParameterMode.OUT);
			 procedureCall.registerParameter(3, Integer.class, ParameterMode.OUT);
			 
			 
			 String name = (String) procedureCall.getOutputParameterValue(2);
			 Integer tenure = (Integer) procedureCall.getOutputParameterValue(3);
			 
			 System.out.println("name\ttenure");
			 System.out.println(name+"\t"+tenure);
			 
			
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
