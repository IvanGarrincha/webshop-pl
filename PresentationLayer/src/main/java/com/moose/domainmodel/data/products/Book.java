package com.moose.domainmodel.data.products;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;


@Data
public class Book {
	
	private Long id;
	
	private String isbn;	
	private String title;
	private int year;
	private double price;
	

	/*
	 *	En bok kan ha flera författare
	 *	Flera böcker kan ha samma författare 
	 */

	private List<Author> coAuthors = new ArrayList<>();
	
	
	private Author author;
	
	/*
	 * Korrekt association? möjligt att göra till oneToMany?
	 */

	private List<Category> categories = new ArrayList<Category>();

	
	/*
	 * Möjligt att ändra till filnamn istället.
	 */

	private String description;
	
	private Image image;
	/*
	 * Image filnamn.
	 */

	public Book() {}
	
	
	
	public Book(String isbn, String title, int year, Double price , Author author) {
		super();
		this.isbn 		=  isbn;
		this.title 		=  title;
		this.year 		=  year;
		this.price 		=  price;
		this.author = author;	
	}
	
	
	
	
	
	
	public Book(String isbn, String title, int year, Double price , String author) {
		super();
		this.isbn 		=  isbn;
		this.title 		=  title;
		this.year 		=  year;
		this.price 		=  price;
		this.author = new Author(author);	
	}
	
	
	public void addAuthor(Author author) {
		this.coAuthors.add(author);
	}
	
	public void addCategory(Category category) {
		
		this.categories.add(category);
	}
	

}
