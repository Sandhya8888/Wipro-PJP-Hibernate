package assignment1;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate2.cfg.xml").addAnnotatedClass(Car.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String q="select * from Car_details";
		@SuppressWarnings("rawtypes")
		NativeQuery q1=session.createSQLQuery(q);
		q1.addEntity(Car.class);
		List<?> l = q1.list();
		l.forEach(i->System.out.println(i));
		session.getTransaction().commit();
	    sessionFactory.close();
	}

}
