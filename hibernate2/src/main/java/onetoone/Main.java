package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Question q1=new Question();
		q1.setQuestion("what is your name?");
		Answer a1=new Answer();
		a1.setAnswer("tanuja");
		q1.setAns(a1);
		s.save(q1);
		s.save(a1);
		t.commit();
		sf.close();
		System.out.println("record inserted successfully!!");
		
	}

}
