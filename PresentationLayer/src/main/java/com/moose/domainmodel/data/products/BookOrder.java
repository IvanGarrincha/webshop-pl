package com.moose.domainmodel.data.products;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.moose.domainmodel.data.user.Customer;

import lombok.Data;

@Data

public class BookOrder implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	
	
	/*
	 * Beroendet mellan kund och order:
	 * om en kund tas bort ska samtliga ordrar tas bort?
	 * 
	 * Man skulle kunna sätta ett värde för att en viss kund 
	 * inte kan tas bort förrän sista ordern har markerats som expiderad. 
	 * 
	 * Man behöver sätta datum och möjlighet att markera en order för expiderad
	 */
	

	private Customer customer;
	

	private List<Book> products = new ArrayList<>();
	
	/*
	 *	Datum för när ordern skapades av kund 
	 */
	private Date placedAt;
	
	/*
	 *  Datum för när ordern är expediterad
	 */
	private Date sendedDate;
	
	private boolean sentToCustomer;
	
	public BookOrder() {}
	public BookOrder(Customer customer)	 {this.customer = customer;}
	public void addProduct(Book product) {this.products.add(product);}

	/*
	 * Endast anställda ska kunna ha behörighet till metoden
	 */
	public void markAsSended() {
		sentToCustomer = true;
		sendedDate = new Date();
	}
	
	
	

	void placedAt() 					 {this.placedAt = new Date();}
}