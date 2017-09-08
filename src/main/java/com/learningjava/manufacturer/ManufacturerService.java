package com.learningjava.manufacturer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ManufacturerService {
	@Autowired
	ManufacturerRepository manufacturerRepository;
	
	public List<Manufacturer> getAllManufacturer() {
		List<Manufacturer> manufacturers = new ArrayList<>();
		manufacturerRepository.findAll().forEach(manufacturers::add);
		return manufacturers;
	}
	public void addManufacturer(Manufacturer manufacturer) {
		
		manufacturerRepository.save(manufacturer);
	}
	public void updateManufacturer(int id, Manufacturer manufacturer) {
		manufacturerRepository.save(manufacturer);
	}
		
}
