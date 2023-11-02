package com.hibernateEx.hibernate1;

import javax.persistence.EntityManager;


public class JpaCrudEx {
	public void insertRecord(Student student) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.clear();
		System.out.println("Record inserted successfully");
	}

}
