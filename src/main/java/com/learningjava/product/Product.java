package com.learningjava.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.learningjava.manufacturer.Manufacturer;

@Entity
public class Product {
	@Id
	int id;
	String name;
	float price;
	String sku;
	@ManyToOne
	Manufacturer manufacturer;
	public Product(int id, String name, float price, String sku, int manufacturerId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sku = sku;
		this.manufacturer = new Manufacturer(manufacturerId, "", "");
	}
	public Product() {
		
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
