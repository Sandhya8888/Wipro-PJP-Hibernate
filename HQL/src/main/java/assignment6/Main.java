package assignment6;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").addAnnotatedClass(Car6.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings({ "deprecation" })
		Criteria c=session.createCriteria(Car6.class);
		c.add(Restrictions.eq("regno","KL-07"));
		@SuppressWarnings("unchecked")
		List<Car6> r=c.list();
		System.out.println(r.size());
		
	
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
