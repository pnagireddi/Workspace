package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.BankAccount;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		Long id=1L;
		Transaction transaction=null;
		boolean flag=false;
		BankAccount account=null;

		try {
			session = HibernateUtil.getSession();
			 account = session.get(BankAccount.class, id);
			
			 if(account !=null) {
				System.out.println("Acount detials before updation "+account);
				 transaction = session.beginTransaction();
				account.setBalance(account.getBalance()+100000);
				flag=true;
			}
			else {
				System.out.println("Account not available for given Id::"+id);
				System.exit(0);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(flag) {
				transaction.commit();
				System.out.println("Opening date       ::"+account.getOpenimgDate());
				System.out.println("Last Updated  date ::"+account.getLastUpdated());
				System.out.println("Version count      ::"+account.getVersionCount());
			}
			else {
				transaction.rollback();
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}
