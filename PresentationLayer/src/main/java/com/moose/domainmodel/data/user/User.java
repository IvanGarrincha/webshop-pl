package com.moose.domainmodel.data.user;

import lombok.Data;



@Data

public class User {//implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	protected String username;

	protected String firstname;
	protected String lastname;
	protected String password;
	

	public User() {}
	 
	
	
	public User(String username, String firstname, String lastname, String password, String role) {
		
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}

//	@Embedded
	private Address address;


	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
