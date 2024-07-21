package in.ineuron.test;

import java.util.List;

import org.hibernate.Filter;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.AccountDetails;
import in.ineuron.util.HibernateUtil;

public class SelectAppUsingHQL {

	public static void main(String[] args) {

		Session session = null;
		try {
			session = HibernateUtil.getSession();

			Filter filter = session.enableFilter("FILTER_BANK_ACCOUNT_STATUS");
			filter.setParameter("acc1", "blocked");
			filter.setParameter("acc2", "closed");

			Query<AccountDetails> query = session.createQuery("from in.ineuron.model.AccountDetails where balance>=:amt");
			query.setParameter("amt", 25000.0f);

			List<AccountDetails> account = query.list();
			account.forEach(System.out::println);

			System.out.println();

			session.disableFilter("FILTER_BANK_ACCOUNT_STATUS");
			Query<AccountDetails> query1 = session.createQuery("from in.ineuron.model.AccountDetails where balance>=:amt");
			query1.setParameter("amt", 25000.0f);

			List<AccountDetails> account1 = query1.list();
			account1.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
