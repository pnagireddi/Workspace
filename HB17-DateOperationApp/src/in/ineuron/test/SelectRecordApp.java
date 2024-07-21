package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.model.PersonInfo;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id=1;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				
				PersonInfo info = session.get(PersonInfo.class, id);
				System.out.println(info);
				
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}
