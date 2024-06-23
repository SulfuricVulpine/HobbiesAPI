package com.example.demo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HobbyService {

    private final HobbyRepository hobbyRepository;

    @Autowired
    public HobbyService(HobbyRepository hobbyRepository) {
    	super();
        this.hobbyRepository = hobbyRepository;
    }
    
    public ResponseEntity<?> addNewHobby(PersonHobbies h) {
		hobbyRepository.save(h);
    	return ResponseEntity
    			.status(HttpStatus.CREATED)
    			.body("Hobby Created Successfully: ");
	}
    
/*
    public ResponseEntity<String> addNewHobby(Person person) {
    	
    	// Get id for person 
    	
    	hobbyRepository.save(h);
    	return ResponseEntity
    			.status(HttpStatus.CREATED)
    			.body("User Hobby Created Successfully: ");
	}
*/
}