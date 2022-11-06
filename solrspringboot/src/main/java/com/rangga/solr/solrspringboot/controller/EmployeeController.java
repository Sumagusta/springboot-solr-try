package com.rangga.solr.solrspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rangga.solr.solrspringboot.model.Employee;
import com.rangga.solr.solrspringboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostConstruct
	public void addEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(373, "Basant", new String[] { "Bangalore", "BTM" }));
		employees.add(new Employee(908, "Santosh", new String[] { "Hyderbad", "XYZ" }));
		employees.add(new Employee(321, "Sagar", new String[] { "Pune", "PQR" }));
		repository.saveAll(employees);
	}

	@GetMapping("/getALL")
	public Iterable<Employee> getEmployees() {
		return repository.findAll();
	}

	@GetMapping("/getEmployee/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
		return repository.findByName(name);
	}
	
}
