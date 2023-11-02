package com.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaCrudOpration {
	
	public void insertRecord(Person person) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.clear();
		System.out.println("Record inserted successfully");
	}
	
	
	public void deleteRecord(int id) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Person find = em.find(Person.class, id);
		em.remove(find);
		em.getTransaction().commit();
		em.clear();
		System.out.println("record deleted successfully!");
	}
	
	public void findRecordById(int id) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Person find = em.find(Person.class, id);
		System.out.println("Person Id : "+find.getId());
		System.out.println("Person Name : "+find.getName());
		System.out.println("Person Age : "+find.getAge());
		System.out.println("Person Email : "+find.getEmail());
		em.getTransaction().commit();
		em.clear();
		System.out.println("record successfully Fetch fron databse");
		
	}
	
	
	public void updateRecord(int id,String name,int age) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Person find = em.find(Person.class, id);
		find.setName(name);
		find.setAge(age);
		em.getTransaction().commit();
		em.clear();
		System.out.println("record updated successfully!");
		
		
	}
	
	
	public void retrievAll() {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		List<Person> lists=new ArrayList<Person>();
		lists=em.createQuery("from Person").getResultList();
		for (Person result : lists ) {
			System.out.println("Person Id: "+result.getId());
			System.out.println("Person Name : "+result.getName());
			System.out.println("Person Age: "+result.getAge());
			System.out.println("Person Email: "+result.getEmail());
			
		}
		em.getTransaction().commit();
		em.clear();
		System.out.println("all record retrieved successfully");
		
		
		
	}
	
	
	
	
	

}
