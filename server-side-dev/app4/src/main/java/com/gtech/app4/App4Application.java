package com.gtech.app4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

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

        //personRepository.save(obj);
        Person obj3 = new Person();
        obj3.setId(1013);
        obj3.setFirstName("abc3");
        obj3.setLastname("xyz3");

        //personRepository.save(obj);
        Person obj2 = new Person();
        obj2.setId(1012);
        obj2.setFirstName("abc2");
        obj2.setLastname("xyz2");

        personRepository.saveAll(Arrays.asList(obj,obj2,obj3));
        System.out.println("done");

/*        Person p1 = personRepository.findById(1012).get();
        System.out.println(p1.getId());
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastname());
*/

/*
        List<Person> persons = (List<Person>) personRepository.findAll();
        for(Person person: persons){
            System.out.println(person.getId());
            System.out.println(person.getFirstName());
            System.out.println(person.getLastname());
            System.out.println("---------------------");
 */
/*                List<Person> persons = (List<Person>) personRepository.findAllById(Arrays.asList(101,1012));
        for(Person person: persons){
            System.out.println(person.getId());
            System.out.println(person.getFirstName());
            System.out.println(person.getLastname());
            System.out.println("---------------------");
            */
/*
        personRepository.deleteById(1013);
*/
/*
        personRepository.delete(obj2);

*/

/*
        personRepository.deleteAll(Arrays.asList(obj, obj2));
*/

/*
        personRepository.deleteAll();
*/
        Person person = personRepository.findByFirstName("abc");
        System.out.println(person.getId());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastname());

        }

    }

