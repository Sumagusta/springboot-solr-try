package com.rangga.solr.solrspringboot.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "employee") // direcly store
public class Employee {
	@Id
	@Field
	private int id;
	@Field
	private String name;
	@Field
	private String[] address;
}
