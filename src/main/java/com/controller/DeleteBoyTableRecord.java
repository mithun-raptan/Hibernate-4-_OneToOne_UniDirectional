package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBoyTableRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Boy b = em.find(Boy.class, 103);
		if (b != null) {
			et.begin();
			em.remove(b);
			et.commit();
			System.out.println("boy record got deleted ");
		}
		else {
			System.out.println("boy record not found...");
		}
	}

}
