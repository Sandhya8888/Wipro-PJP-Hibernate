package assignment5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main5 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate5.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Address a=new Address();
		a.setVillage("Veldanda");
		a.setMandal("Narmetta");
		a.setDistrict("Jangaon");
		a.setState("Telangana");
		Employee e=new Employee();
		e.setEname("Sandhya");
		e.setErole("Engineer");
		e.setSalary(50000);
		e.setAdd(a);
		session.save(e);
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
