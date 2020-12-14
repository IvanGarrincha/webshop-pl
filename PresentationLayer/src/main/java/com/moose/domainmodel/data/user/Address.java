package com.moose.domainmodel.data.user;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Embeddable
@Data
@NoArgsConstructor
public class Address {

//	@NotNull
//	@Column(nullable=false)
	private String street;
	
	private String city;
	
//	@NotNull
//	@Column(nullable = false, length=5)
	private String postalCode;

//	public Address(@NotNull String street, String city, @NotNull String postalCode) {
//		super();
//		this.street = street;
//		this.city = city;
//		this.postalCode = postalCode;
//	}
	public Address(String street, String city, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	
}
