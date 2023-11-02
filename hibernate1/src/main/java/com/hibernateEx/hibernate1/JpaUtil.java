package com.hibernateEx.hibernate1;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
private static final String PERSISTENCE_UNIT_NAME="JPADemo";
	
	private static EntityManagerFactory em;
	public static EntityManagerFactory getEntityManagerFactory() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return em;

	}
	public static void shutdown() {
		if (em!= null) {
		em.close();
		}
	}

}
