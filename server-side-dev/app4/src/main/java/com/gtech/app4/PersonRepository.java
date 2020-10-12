package com.gtech.app4;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    public  Person findByFirstName(String firstName);
    public Person findByLastname(String lastname);
    public List<Person> findAllByFirstName(String firstName);
    public List<Person> findAllByLastname(String lastname);




}

