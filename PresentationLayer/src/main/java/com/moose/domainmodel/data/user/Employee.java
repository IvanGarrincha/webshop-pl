package com.moose.domainmodel.data.user;

//@Entity
public class Employee extends User {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public Employee(String username, String firstname, String lastname, String password) {
		super(username, firstname, lastname, password, "Employee");
	}
	
	public Employee() {
		super();
	}
}
