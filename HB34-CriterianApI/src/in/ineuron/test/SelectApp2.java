package in.ineuron.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import in.ineuron.model.InsurencePolicies;
import in.ineuron.util.HibernateUtil;

public class SelectApp2 {

	public static void main(String[] args) {

		Session session = null;
		;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {

				Criteria criteria = session.createCriteria(InsurencePolicies.class);

				
				  ProjectionList list = Projections.projectionList();
				  list.add(Projections.property("pname"));
				  list.add(Projections.property("company"));
				  
				  criteria.setProjection(list);
				 

				SimpleExpression cond1 = Restrictions.ge("tenure", 15);
				SimpleExpression cond2 = Restrictions.le("tenure", 30);
				criteria.add(cond1);
				criteria.add(cond2);

				List<Object[]> data = criteria.list();

				System.out.println("pname\tcompany");
				data.forEach(row -> {
					for (Object obj : data) {
						System.out.print(obj + "\t");
					}
				});

			}

		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			HibernateUtil.closeSessionFactory();
			HibernateUtil.closeSessionFactory();
		}

	}

}
