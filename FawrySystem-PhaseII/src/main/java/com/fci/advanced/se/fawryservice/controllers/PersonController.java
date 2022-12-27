package com.fci.advanced.se.fawryservice.controllers;

import com.fci.advanced.se.fawryservice.entities.Person;
import com.fci.advanced.se.fawryservice.services.PersonService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping(value = "/persons")
    public String addPerson(@RequestBody Person person){
        return service.add(person);
    }

    @GetMapping(value = "/persons/{id}")
    public Person getPerson(@PathVariable("id") int id){
        return service.getPersonById(id);
    }

    @GetMapping(value = "/persons")
    public Person searchPersons(@RequestParam("name") String name){
        return service.searchByName(name);
    }


}
