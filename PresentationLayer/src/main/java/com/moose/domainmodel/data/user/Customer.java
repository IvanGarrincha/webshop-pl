package com.moose.domainmodel.data.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.moose.domainmodel.data.products.BookOrder;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Customer extends User {

	/*
	 * behöver tänkta på beroendet mellan kund och order.
	 * 
	 * 
	 */
	
		
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	//Fetch är Lazy här by Default
//	@OneToMany(mappedBy="id")		
	private List<BookOrder> orders = new ArrayList<>();

	private Date registered;
	

	public Customer() {
		super();
	}
	
	public Customer(String username, String firstname, String lastname, String password) {
		super(username, firstname, lastname, password, "customer");
		
	}
	
	private Address address;
	
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		log.info("Granted authorities username: " + this.getUsername());
//		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//	}
//
//	public void addOrder(BookOrder order) {
//		this.orders.add(order);
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//	
//	@PrePersist
//	public void registerDate() {
//		this.registered = new Date();
//	}
//	
//	@PreRemove
//	public void checkNonActiveOrders() throws CustomerDeletionException{
//		
//		for(BookOrder order: orders) {
//			if(order.isSentToCustomer() == false)
//				throw new CustomerDeletionException("Customer has orders in process");
//			
//		}
//	}

	public void setAddress(Address address) {
		this.address = address;
		
	}
	
	
	
}
