package com.learningjava.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	public List<Product> getAllProducts(int id) {
		List<Product> products = new ArrayList<>();
		productRepository.findByManufacturerId(id);
		productRepository.findAll().forEach(products::add);
		return products;
	}
	public Product getProduct(int id) {
		return productRepository.findOne(id);
	}
	public void deleteProduct(int id) {
		productRepository.delete(id);
	}
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
}
