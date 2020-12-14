package com.moose.presentationlayer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moose.domainmodel.data.products.Book;
import com.moose.domainmodel.data.products.Category;

@Service
public interface DataService {

	
	public List<Book> getBooks();
	
	public List<Category> getCategories();

	public Optional<Book> findBookByIsbn(String isbn);
	
	
	
}
