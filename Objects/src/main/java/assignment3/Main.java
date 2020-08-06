package assignment3;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter id:");
			String id=s.next();
			System.out.println("Enter price:");
			int price=s.nextInt();
			Flower f= (Flower) session.get(Flower.class,id);
			f.setPrice(price);
			session.getTransaction().commit();
			System.out.println("Updated successfully\n The details are\n");
			System.out.println("The id of the flower is "+f.getFlowerID());
			System.out.println("The name of the flower is "+f.getFlowerName());
			System.out.println("The color of the flower is "+f.getColor());
			System.out.println("The price of the flower is "+f.getPrice());
			s.close();
			}
		catch(Exception e) {
			System.out.println("No flower exists with that id");
		}	
	    
	    sessionFactory.close();

	}

}
