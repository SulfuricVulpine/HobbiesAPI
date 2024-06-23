package com.example.demo;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
 
 
//For Hibernate
@Entity
//For table in database
@Table

public class Person {
 
 @Id
 @SequenceGenerator(
         name="person_sequence",
         sequenceName="person_sequence",
         allocationSize = 1
 
 )
 @GeneratedValue(
         strategy = GenerationType.SEQUENCE,
         generator = "person_sequence"
 )
	private Long id;
	private String name;
	private String address;
	private String phoneNumber;
 
	public Person () {
	}
 
	public Person (String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
 
	public String getAddress() {
		return address;
	}
 
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public Long getid(String name) {
		return id;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void setAddress(String address) {
		this.address = address;
	}
 
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
 
}
