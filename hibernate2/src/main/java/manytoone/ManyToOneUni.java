package manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneUni {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		User u1 =new User(2, "vidya", "27");
		s.save(u1);
		User u2 =new User(3, "trupti", "28");
		s.save(u2);
		Role r1 =new Role(1, "java Developer");
		s.save(r1);
		List<User> l1=new ArrayList<User>();
		l1.add(u1);
		l1.add(u2);
		r1.setUser(l1);
		s.save(r1);
		t.commit();
		System.out.println("record inserted successfully!");
	}

}
