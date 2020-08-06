package assignment1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Flower f= (Flower) session.get(Flower.class,"2");
		System.out.println("The id of the flower is "+f.getFlowerID());
		System.out.println("The name of the flower is "+f.getFlowerName());
		System.out.println("The color of the flower is "+f.getColor());
		System.out.println("The price of the flower is "+f.getPrice());
	    session.getTransaction().commit();
	    sessionFactory.close();

	}

}
