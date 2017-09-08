package com.learningjava.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	public List<Product> findByManufacturerId(int manufacturerId);
}
