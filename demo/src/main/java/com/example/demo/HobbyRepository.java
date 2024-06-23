package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HobbyRepository extends JpaRepository<PersonHobbies, Long> {

    @Query("SELECT h FROM Hobby h WHERE h.name = ?1")
    Optional<PersonHobbies> findHobbyBy(String hobby);
}