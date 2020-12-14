package com.moose.domainmodel.data.products;

import lombok.Data;

@Data

public class Category {

	
	
	private Long id;
	
	
	private String name;
	
	public Category() {}
	
	public Category(String name) {this.name = name;}
	
	
}
