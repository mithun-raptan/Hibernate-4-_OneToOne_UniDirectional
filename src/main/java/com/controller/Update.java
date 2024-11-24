package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
				System.out.println(emf);
				EntityManager em=emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Boy b = em.find(Boy.class, 101);
				if(b!=null) {
					Girl g=b.getGirl();
					if(g!=null) {
						g.setName("NidhiBabe");
						et.begin();
						em.merge(g);
						et.commit();
						System.out.println("girl record updated");
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
