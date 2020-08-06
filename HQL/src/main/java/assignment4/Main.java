package assignment4;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").addAnnotatedClass(Car4.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Car4> q1=session.createQuery("From Car4 as c where c.Manufacturer LIKE 'V%' ");
		List<Car4> l = q1.getResultList();
		System.out.println(l);
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
