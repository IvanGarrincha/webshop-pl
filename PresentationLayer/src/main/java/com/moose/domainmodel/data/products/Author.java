package com.moose.domainmodel.data.products;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Author {

	
	private Long id;
	
	private String name;
	
	
	
	private List<Book> title = new ArrayList<>();
	
	
	public Author() {}
	public Author(String name) {
		this.name = name;
	}
	
	public void addBook(Book book) {
		this.title.add(book);
	}
}
