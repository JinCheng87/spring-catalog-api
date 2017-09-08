package com.learningjava.manufacturer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manufacturer {
	@Id
	int id;
	String name;
	String description;
	
	public Manufacturer() {
		
	}
	public Manufacturer(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
