package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
import java.util.Optional;
 
	@Repository
	public interface UserRepository extends JpaRepository<Person, Long> {
 
	    @Query("SELECT p FROM Person p WHERE p.hobbies = ?1")
	    Optional<Person> findPersonBy(Long id);
	}
