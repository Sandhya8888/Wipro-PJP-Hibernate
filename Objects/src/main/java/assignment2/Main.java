package assignment2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			Flower f= (Flower) session.get(Flower.class,"5");
			session.delete(f);
			System.out.println("Deleted successfully");
		}
		catch(Exception e) {
			System.out.println("No flower exists with that id");
		}	
	    session.getTransaction().commit();
	    sessionFactory.close();

	}

}
