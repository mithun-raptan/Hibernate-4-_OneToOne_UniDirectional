package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Boy b = new Boy();
		b.setId(103);
		b.setName("abhijit");
		b.setEmail("a@g.com");
		b.setPassword("9012");
		
		Girl g= new Girl();
		g.setId(3);
		g.setName("ranuMondal");
		g.setInstaId("ranuSona");
		
		//Mapping
		b.setGirl(g);
		
		//to save into the Database
		et.begin();
		em.persist(b);
		em.persist(g);
		et.commit();
		
		
		
	}

}
