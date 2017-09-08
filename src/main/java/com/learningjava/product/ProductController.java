package com.learningjava.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learningjava.manufacturer.Manufacturer;
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(method=RequestMethod.POST, value="/manufacturers/{id}/products")
	public void addProduct(@RequestBody Product product, @PathVariable int id) {
		product.setManufacturer(new Manufacturer(id, "", ""));
		productService.addProduct(product);
	}
	@RequestMapping("/manufacturers/{id}/products")
	public List<Product> getAllProducts(@PathVariable int id) {
		return productService.getAllProducts(id);
	}
}
