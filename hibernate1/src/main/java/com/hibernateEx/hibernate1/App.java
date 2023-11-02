package com.hibernateEx.hibernate1;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	JpaCrudEx jp=new JpaCrudEx();
    	Student s1=new Student();
    	s1.setName("tanuja");
    	jp.insertRecord(s1);
    	
    }
}  
    	/*SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Query query = s.createQuery("from Student");
        List<Student> list = query.list();
        for (int i = 0; i <list.size(); i++) {
        	System.out.println("Id :"+list.get(i).getId()+"\nName :"+list.get(i).getName());
			
		}
        for (Student student : list) {
        	System.out.println("Id:"+student.getId()+"\nName:"+student.getName());
			
		}
       
        
        
        sf.close();
    }
}*/


/*Query query = session.createQuery("from Student");

List<Student> arr = query.list();



for(int i=0;i<arr.size();i++)

{

	System.out.println("Id :"+arr.get(i).getSid() +"\nName : "+arr.get(i).getSname());

}





for(Student e : arr)

{

	System.out.println("Id : "+e.getSid()+"\nName : "+e.getSname());

}*/