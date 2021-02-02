package com.github.sammejanderson.PersonAPI.repository;


import com.github.sammejanderson.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
