package com.learningjava.manufacturer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManufacturerController {
	@Autowired
	private ManufacturerService manufacturerService;
	
	@RequestMapping("/manufacturers")
	public List<Manufacturer> getAllManufacturer(){
		return manufacturerService.getAllManufacturer();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/manufacturers")
	public void addManufacturer(@RequestBody Manufacturer manufacturer) {
		manufacturerService.addManufacturer(manufacturer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/manufacturers/{id}")
	public void updateManufacturer(@RequestBody Manufacturer manufacturer, @PathVariable int id) {
		manufacturerService.updateManufacturer(id, manufacturer);
	}
}
