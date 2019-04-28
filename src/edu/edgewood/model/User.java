package edu.edgewood.model;

import java.time.LocalDate;

public class User {
	String userId;
	String password;
	String firstName;
	String lastName;
	LocalDate createDate;
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	
	
}
