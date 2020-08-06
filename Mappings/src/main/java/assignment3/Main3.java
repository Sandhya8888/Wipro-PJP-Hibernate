package assignment3;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate3.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("Botswana","Gaborone");
		m1.put("Zimbabwe","Harare");
		Map<String, String> m2=new HashMap<String, String>();
		m2.put("India","New Delhi");
		m2.put("Japan","Tokyo");
		Map<String, String> m3=new HashMap<String, String>();
		m3.put("Germany","Berlin");
		m3.put("Greece","Athens");
		Map<String, String> m4=new HashMap<String, String>();
		m4.put("Australia","Canberra");
		m4.put("Fiji","Suva");
		Map<String, String> m5=new HashMap<String, String>();
		m5.put("Cuba","Havana");
		m5.put("Jamaica","Kingston");
		Map<String, String> m6=new HashMap<String, String>();
		m6.put("Brazil","Brasilia");
		m6.put("Chile","Santiago");
		Continent d1=new Continent("Africa",m1);
		Continent d2=new Continent("Asia",m2);
		Continent d3=new Continent("Europe",m3);
		Continent d4=new Continent("Australia",m4);
		Continent d5=new Continent("North and Central America",m5);
		Continent d6=new Continent("South America",m6);
		session.persist(d1);
		session.persist(d2);
		session.persist(d3);
		session.persist(d4);
		session.persist(d5);
		session.persist(d6);
		session.getTransaction().commit();
	    sessionFactory.close();

	}

}
