package in.ineuron.test;

import java.util.Optional;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.Product;
import in.ineuron.util.HibernateUtil;

public class Test7 {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {

				System.out.println("PLEASE ENTER ID ::");
				@SuppressWarnings("resource")
				Integer id = new Scanner(System.in).nextInt();
				// prepare the query object to hold HQL query.
				@SuppressWarnings("unchecked")
				Query<Product> query = session.createQuery("FROM in.ineuron.model.Product WHERE pid=:id");

				query.setParameter("id", id);

				// Execute the query(select *from the table where pid=(?))
				Optional<Product> product = query.uniqueResultOptional();


				// process the list of objects
				if(product.isPresent()) {
					System.out.println(product.get());
				}
				else {
					System.out.println("PRODUCT IS NOT AVAILABLE FOR GIVEN ID:::" + id);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}

}
