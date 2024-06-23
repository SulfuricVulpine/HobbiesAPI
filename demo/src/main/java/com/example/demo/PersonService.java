package com.example.demo;
 
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
 
@Service
public class PersonService {
 
	private final UserRepository userRepository;
    //private final HobbyRepository hobbyRepository;
 
    @Autowired
    public PersonService(UserRepository userRepository) {
        this.userRepository = userRepository;
        //this.hobbyRepository = hobbyRepository;
    }
 
 
	public ResponseEntity<?> addNewPerson(Person p) {
		userRepository.save(p);
    	return ResponseEntity
    			.status(HttpStatus.CREATED)
    			.body("User Created Successfully: ");
	}
	/*
	@Transactional
    public ResponseEntity<String> updatePerson(long id, String name, String address, String number){
        Optional<Person> person = UserRepository.findById(id);
        if (person.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("this person does not exist :(");
        }
        if (name != null &&  name.length() > 0 && !Objects.equals(person.get().getName(),name)) {
            person.get().setName(name);
        }
        if (address != null &&  address.length() > 0 && !Objects.equals(person.get().getAddress(),address)) {
            person.get().setAddress(address);
        }
        if (number != null &&  number.length() > 0 && !Objects.equals(person.get().getPhoneNumber(),number)) {
            person.get().setPhoneNumber(number);
        }
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body("person information updated to: "+person.toString());
    }
	*/
	
	
	/*
	public void delete(Person p){
        this.UserRepository.delete(p);
    }
	
	public ResponseEntity<String> getPerson(long id) {
        Optional<Person> person = UserRepository.findById(id);

        if(person.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("person with id " + id + " does not exist");
        }
        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(person.toString());
    }
	
	@Transactional
    public ResponseEntity<String>  updatePerson(Long id, String hobbies, String address) {
        Optional<Person> person = UserRepository.findById(id);

}
*/
	//@Transactional
    //public ResponseEntity<String>  updatePerson(Long personId, String hobbies, String address) {
    //    Optional<Person> person = UserRepository.findById(personId);
/*
        if (person.isEmpty()) {
            ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("person with id " + personId + " not found");
        }

        
        if (hobbies != null &&
                hobbies.length() > 0 &&
                !Objects.equals(person.get().getHobbies(), hobbies)) {
            person.get().setHobbies(hobbies);
        }
        

        if (address != null &&
                address.length() > 0 &&
                !Objects.equals(person.get().getAddress(),address)) {
            person.get().setAddress(address);
        };
        
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(person.get().toString());
    }
*/
}