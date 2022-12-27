package com.fci.advanced.se.fawryservice.services;

import com.fci.advanced.se.fawryservice.entities.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    List<Person> personList = new ArrayList<>();

    public String add(Person person) {
        for (Person person1 : personList) {
            if(person1.getId() == person.getId()){
                return "Id already exists";
            }
        }
        personList.add(person);
        return "Added Successfully";
    }

    public Person getPersonById(int id) {
    	for (Person person1 : personList) {
            if(person1.getId()==id){
                return person1;
            }
    	}
		return null;
        
    }

    public Person searchByName(String name) {
        for (Person person1 : personList) {
            if(person1.getName().equals(name)){
                return person1;
            }
        }
        return null;
    }
}
