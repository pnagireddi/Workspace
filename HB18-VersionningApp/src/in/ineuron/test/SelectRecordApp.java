package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.MobileCustomer;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id=1;
		MobileCustomer customer=null;
		Transaction transaction=null;
		boolean flag=false;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				
				 customer = session.get(MobileCustomer.class, id);
				System.out.println("Data Before modification........");
				System.out.println(customer);
				
				transaction=session.beginTransaction();
				
				customer.setCallerTone("Jai Krisham kunadam murai....");
				
				session.update(customer);
				flag=true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(flag) {
				transaction.commit();
				System.out.println("Data after updation....");
				System.out.println(customer);
			}
			else {
				transaction.rollback();
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}
