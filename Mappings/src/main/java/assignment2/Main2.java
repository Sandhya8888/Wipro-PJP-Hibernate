package assignment2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate2.cfg.xml").addAnnotatedClass(MultiCarOwner.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CarDetail2 d1=new CarDetail2();
		CarDetail2 d2=new CarDetail2();
		ArrayList<CarDetail2> l=new ArrayList<CarDetail2>();
		l.add(d1);
		l.add(d2);
		MultiCarOwner c=new MultiCarOwner();
		c.setCars(l);
		session.persist(c);
		session.getTransaction().commit();
	    sessionFactory.close();
	}

}
