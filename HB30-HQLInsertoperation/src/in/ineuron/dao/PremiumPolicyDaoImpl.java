package in.ineuron.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.ineuron.util.HibernateUtil;

public class PremiumPolicyDaoImpl implements IPremiumpolicyDao {


	@SuppressWarnings("rawtypes")
	@Override
	public String policyCopy(int minTenure) {
		
		Session session=null;
		Transaction transaction=null;
		int count=0;
		String msg="";
		boolean flag=false;
		try {
		session=HibernateUtil.getSession();
		if (session != null) {	
		 transaction = session.beginTransaction();
		 
		 Query query = session.getNamedQuery("HQL_TRANSFER_POLICIES");
		   query.setParameter("min", minTenure);
		   count=query.executeUpdate();
		   flag=true;
		}
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			if(flag) {
				transaction.commit();
				msg = "No of rows transferred is :: " + count;
			}
			else {
				msg = "records not copied to table";
			}
		}
		return msg;
	}

}
