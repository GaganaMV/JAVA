package com.hibernateEx.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Learners s4=new Learners();
        s4.setName("manya");
        s4.setCourse("a");
        Learners s5=new Learners();
        s5.setName("vinuta");
        s5.setCourse("full java");
        Learners s6=new Learners();
        s6.setName("janani");
        s6.setCourse("p");
        
        s.update(s4);
        s.update(s5);
        s.update(s6);
        
        t.commit();
        System.out.println("data inserted successfully");
        sf.close();
        
        
        
    }
}
