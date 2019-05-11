package edu.edgewood.model;

import java.time.LocalDate;
import java.util.UUID;

public class User {
	String userId;
	String password;
	String firstName;
	String lastName;
	LocalDate createdDate;
	

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCreatedDate(LocalDate createDate) {
		this.createdDate = createDate;
	}
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	
	
}
