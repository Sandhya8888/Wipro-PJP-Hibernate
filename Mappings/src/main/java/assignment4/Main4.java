package assignment4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main4 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate4.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee e1=new Employee();
		e1.setName("Sandhya");
		e1.setRole("engineer");
		e1.setSalary(50000);
		Passport p1=new Passport();
		p1.setPlaceIssue("hyd");
		e1.setP(p1);
		session.save(e1);
		Employee e = (Employee) session.get(Employee.class,119);
		session.delete(e);
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
