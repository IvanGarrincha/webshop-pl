package com.moose.presentationlayer.commands;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckoutCommand {

	@NotEmpty
	@Size(min = 2, max = 50)
	private String firstname;

	@NotEmpty
	@Size(min = 2, max = 50)
	private String lastname;
	
	
	@NotEmpty
	@Size(min = 2, max = 50)
	private String addressLine1;
	private String addressLine2;
	
	@NotEmpty
	@Size(min = 2, max = 50)
	private String city;
	
	@NotEmpty
	@Size(min = 5, max = 5)
	private String postalCode;

	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {	
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
