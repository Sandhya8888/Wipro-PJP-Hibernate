package assignment5;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").addAnnotatedClass(Car5.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings({ "deprecation" })
		Criteria c=session.createCriteria(Car5.class);
		c.add(Restrictions.eq("color","White"));
		@SuppressWarnings("unchecked")
		List<Car5> r=c.list();
		System.out.println(r);
		
	
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
