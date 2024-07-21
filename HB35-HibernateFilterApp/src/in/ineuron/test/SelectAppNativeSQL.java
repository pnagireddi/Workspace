package in.ineuron.test;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import in.ineuron.model.AccountDetails;
import in.ineuron.util.HibernateUtil;

public class SelectAppNativeSQL {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Session session = null;
		try {
			session = HibernateUtil.getSession();

			Filter filter = session.enableFilter("FILTER_BANK_ACCOUNT_STATUS");
			filter.setParameter("acc1", "blocked");
			filter.setParameter("acc2", "closed");

			NativeQuery<AccountDetails> nQuery = session.createSQLQuery("select * from accountdetails where balance>=:amt");
			nQuery.setParameter("amt", 25000.0f);
			nQuery.addEntity(AccountDetails.class);
			List<AccountDetails> account = nQuery.list();
			account.forEach(System.out::println);

			System.out.println();

			session.disableFilter("FILTER_BANK_ACCOUNT_STATUS");
			NativeQuery<AccountDetails> nQuery1 = session.createSQLQuery("select * from accountdetails where balance>=:amt");
			nQuery1.setParameter("amt", 25000.0f);
			nQuery1.addEntity(AccountDetails.class);

			List<AccountDetails> account1 = nQuery1.list();
			account1.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
