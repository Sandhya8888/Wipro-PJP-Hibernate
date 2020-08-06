package assignment3;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").addAnnotatedClass(Car3.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a registration number");
		String p=s.next();
		@SuppressWarnings("unchecked")
		Query<Car3> q1=session.createQuery("From Car3 as c where c.regno=?0");
		q1.setParameter(0,p);
		List<Car3> l = q1.list();
		System.out.println(l);
		session.getTransaction().commit();
	    sessionFactory.close();
	    s.close();
	}

}
