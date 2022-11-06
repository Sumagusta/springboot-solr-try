package com.rangga.solr.solrspringboot.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.rangga.solr.solrspringboot.model.Employee;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Integer> {
	Employee findByName(String name);
}
