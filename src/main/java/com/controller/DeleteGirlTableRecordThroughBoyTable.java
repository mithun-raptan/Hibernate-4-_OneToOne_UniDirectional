package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteGirlTableRecordThroughBoyTable {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
			System.out.println(emf);
			EntityManager em=emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Boy b = em.find(Boy.class, 102);
			if (b != null) {
				Girl g = b.getGirl();
				if (g != null) {
					b.setGirl(null);
					et.begin();
					em.remove(g);
					et.commit();
					System.out.println("girl record got deleted...");
				}
				else {
					System.out.println("girl record no there...");
				}
			}
			else {
				System.out.println("boy record not present");
			}
			
		}
}
