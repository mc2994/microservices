package com.appsdeveloperblog.photoapp.api.users.ui.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 745292163766866273L;

	@NotNull(message="First Name cannot be null")
	@Size(min=2, message="First Name must not be less than two characters")
	private String firstName;
	
	@NotNull(message="Last Name cannot be null")
	@Size(min=2, message="Last Name must not be less than two characters")
	private String lastName;
	
	@NotNull(message="Password cannot be null")
	@Size(min=8, max=16, message="Password must be equal or greater than 8 characters and less than 16 characters")
	private String password;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
