package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Boy b=em.find(Boy.class, 101);
		if(b!=null) {
			System.out.println(b.getName()+" " + b.getEmail()+ " "+ b.getPassword());
			Girl g=b.getGirl();
			if(g!=null) {
				System.out.println(g.getName()+" "+g.getInstaId());
			}
			else {
				System.out.println("girl record not found");
			}
		}
		else {
			System.out.println("boy record not found");
		}
			
	}

}
