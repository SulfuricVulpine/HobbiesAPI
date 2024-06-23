package com.example.demo;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(path = "api/v1/")
public class PersonController {
 
    private final PersonService personService;
    private HobbyService hobbyService;
    
    @Autowired
    public PersonController(PersonService personService, HobbyService hobbyService) {
        this.personService = personService;
        this.hobbyService = hobbyService;
    }
 
    @PostMapping(path = "person/add")
    public ResponseEntity<?> addNewPerson(@RequestBody Person p) {
        return personService.addNewPerson(p);
    }
    
    @PostMapping(path = "hobby/add")
    public ResponseEntity<?> addNewHobby(@RequestBody PersonHobbies h) {
        return hobbyService.addNewHobby(h);
    }
    
    /*
    @PostMapping (path = "/person/hobbies/add")
    public ResponseEntity<?> addNewHobby(@RequestBody Person p) {
    	
    	// Query the person by name and get the id from the table
    	Long id = p.getid(p.getName());
    	
        return hobbyService.addNewHobby(p);
    }
    */
    
    
    //attempt at updating person attributes, runs into issue where in Person service if 
    // @Transactional
    // public ResponseEntity<String>  updatePerson(Long id, String hobbies, String address) {
    // Optional<Person> person = UserRepository.findById(id);
    // is run, the UserRepository section freaks out & doesn't want to run & goes into an endless try/catch loop trying to fix it
    
    /*
    @PutMapping(path = "{personId}")
    public ResponseEntity<String> updatePerson(@PathVariable("personId") long id,
                                @RequestParam(required = false) String hobbies,
                               @RequestParam(required = false) String address) {

        return personService.updatePerson(id, hobbies, address);
    }
    */
    
    //failed attempt at retrieving all get all persons, half baked & mostly unfinished, disregard for other snippets with more work put in
    
    /*
    @GetMapping(path = "{personId}")
    public ResponseEntity<String> getPerson(@PathVariable("personId") long personId) {
        return personService.getPerson(personId);
    }
    
    //failed attempt at deleting entries, this is a cobbled together snippet from a tutorial edited to fit this project but failed to compile
    
    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Long id){
        if(!UserRepository.findById(id).equals(Optional.empty())){
            UserRepository.deleteById(id);
            return true;
        }
        return false;
    }
    */
}
