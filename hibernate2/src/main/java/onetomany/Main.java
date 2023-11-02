package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Question1 q12=new Question1();
		q12.setQuestion("sql");
		s.save(q12);
		Answer1 a1=new Answer1();
		a1.setAnswer("hql");
		a1.setAnswer("query");
		a1.setQstn(q12);
		s.save(a1);
		List<Answer1> l1=new ArrayList<Answer1>();
		l1.add(a1);
		s.save(q12);
		s.save(a1);
		t.commit();
		sf.close();
		System.out.println("record inserted successfully!!");

	}

}
