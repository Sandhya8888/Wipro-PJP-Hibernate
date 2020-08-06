package assignment1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(CarOwner.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CarOwner c=new CarOwner();
		c.setOwnerId(20);
		c.setOwnerName("Roy2");
		CarDetail d=new CarDetail();
		d.setRegno("KL-07");
		d.setModel("Swift");
		d.setColor("White");
		d.setManufacturer("Toyota");
		c.setCar(d);
		d.setCo(c);
		session.persist(c);
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
