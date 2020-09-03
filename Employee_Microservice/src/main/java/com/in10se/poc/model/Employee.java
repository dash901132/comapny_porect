package com.in10se.poc.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Document("employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = UUID.randomUUID().toString();
	}
	

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
	

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
}
