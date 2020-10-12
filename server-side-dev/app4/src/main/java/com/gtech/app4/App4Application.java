package com.gtech.app4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App4Application implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {

        SpringApplication.run(App4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person obj = new Person();
        obj.setId(101);
        obj.setFirstName("abc");
        obj.setLastname("xyz");

        personRepository.save(obj);


    }
}
