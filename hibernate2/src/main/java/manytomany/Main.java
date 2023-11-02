package manytomany;

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
		Question2 q1=new Question2();
		q1.setQname("java is 100% object oriented program Y/N");
		s.save(q1);
		Answer2 a1=new Answer2();
		a1.setAname("java is not 100% oop");
		a1.setAname("without creating object also we run the program");
		s.save(a1);
		List<Question2> l1=new ArrayList<Question2>();
		l1.add(q1);
		List<Answer2> l2=new ArrayList<Answer2>();
		l2.add(a1);
		q1.setAns(l2);
		a1.setQn(l1);
		s.save(q1);
		s.save(a1);
		t.commit();
		System.out.println("record inserted sucessfully!");
		

	}

}
