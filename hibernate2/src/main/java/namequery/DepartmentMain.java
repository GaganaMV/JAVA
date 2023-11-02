package namequery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DepartmentMain {

	public static void main(String[] args) {
		SessionFactory session =new Configuration().configure().buildSessionFactory();
		Session session1 = session.openSession();
		Transaction transction = session1.beginTransaction();
//		Department d1=new Department(1, "cse", "karwar");
//		session1.save(d1);
//		Department d2=new Department(2, "EC", "majali");
//		session1.save(d2);
//		Department d3=new Department(3, "mech", "honnavra");
//		session1.save(d3);
//		transction.commit();
//		session.close();
//		System.out.println("Record inserted successfully");
		Query q=session1.getNamedQuery("findDepartmentByName");
			q.setString("dname","cse");

	  List<Department> d3= q.list();

	  Iterator<Department> itr = d3.iterator();

	  while (itr.hasNext()) {

		  Department d4= itr.next();

		  System.out.println(d4);

	  }
	  
	  Query createQuery = session1.createQuery("select count(id) from Department");
	  createQuery.list();
	  System.out.println("Department count :"+createQuery.list().get(0));
	 
	  
	  SQLQuery c = session1.createSQLQuery("select max(id) from department");
	  c.list();
	  System.out.println("Max id:"+c.list().get(0));
	  
	  SQLQuery c1 = session1.createSQLQuery("select count(dname) from department group by dname having dname='cse'");
	  c1.list();
	  System.out.println("Count dname: "+ c1.list().get(0));
		
	  SQLQuery c2 = session1.createSQLQuery("select count(dlocation) from department group by dlocation having dlocation='karwar'");
	  c2.list();
	  System.out.println("Count dname: "+ c2.list().get(0));
	  
	  SQLQuery c3 = session1.createSQLQuery("select count(id),dlocation from Department group by dlocation having count(id)>1");
	  c3.list();
	  System.out.println("Count id"+c3.list().size());
	  
	  SQLQuery c4 = session1.createSQLQuery("select count(*) from Department");
	  c4.list();
	  System.out.println("Count id"+c4.list().get(0));
	  
	  SQLQuery c5 = session1.createSQLQuery("select dname from department group by dname having dname='cse'");
	  List list = c5.list();
	  Iterator iterator = list.iterator();
	  while (iterator.hasNext()) {
		Object next = iterator.next();
		System.out.println(next);
	  }
	  
	  SQLQuery c6 = session1.createSQLQuery("select dname from Department");
	  c6.list();
	  System.out.println("Department Name: "+c6.list().get(0)+c6.list().get(1));
	  
	  
	  
	}

}
