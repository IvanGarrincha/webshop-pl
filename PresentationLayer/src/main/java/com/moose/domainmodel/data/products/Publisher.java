//package com.moose.domainmodel.data.products;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Publisher {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	private String name;
//	
//	
//	@OneToMany
//	private List<Book> titles = new ArrayList<>();
//	
//	
//	public Publisher(String name) {
//		this.name = name;
//	}
//	
//	public Publisher() {}
//	
//	
//	public void addBook(Book title) {
//		titles.add(title);
//	}
//	
//	public void setName(String name) {this.name=name;}
//	public String getName() {return this.name;}
//}
