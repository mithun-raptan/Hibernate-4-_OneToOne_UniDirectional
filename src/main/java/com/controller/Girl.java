package com.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Girl {
	@Id
	private int id;
	private String name;
	private String instaId;
	
	//public getter() and setter()

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstaId() {
		return instaId;
	}
	public void setInstaId(String instaId) {
		this.instaId = instaId;
	} 
	
	

}
