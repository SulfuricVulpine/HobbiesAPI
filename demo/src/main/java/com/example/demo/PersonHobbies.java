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

public class PersonHobbies {
	
	@Id
    @SequenceGenerator(
            name="hobbies_sequence",
            sequenceName="hobbies_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hobbies_sequence"
    )
	
	Long id;
	//Long personId;
	String name;
	String hobbies;
	
	public PersonHobbies (String name,String hobbies) {
		super();
		this.name = name;
		this.hobbies = hobbies;
	}
	
	public PersonHobbies() {	
	}
	/*
	public Long hobbyGetid() {
		return id;
	}
	*/
	public String hobbyGetname() {
		return name;
	}
	
	public String hobbyGethobbies() {
		return hobbies;
	}
	/*
	public void hobbySetid(Long id) {
		this.id = id;
	}
	*/
	public void hobbySetName(String name) {
		this.name = name;
	}
	
	public void hobbySetHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
}
