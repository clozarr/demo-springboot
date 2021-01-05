package com.example.demo.controller;

import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public long save(@RequestBody Person person){

        personService.save(person);
        return person.getIdPerson();
    }

    @GetMapping("/listAll")
    public Iterable<Person> listAllPersons(){
        return personService.list();
    }

    @GetMapping("/list/{id}")
    public Person listPersonById(@PathVariable("id") int id){
        Optional<Person> person = personService.findPersonById(id);
        if(person.isPresent())
            return person.get();
        throw new ModelNotFoundException("¡Persona no encontrada!");
    }

}
