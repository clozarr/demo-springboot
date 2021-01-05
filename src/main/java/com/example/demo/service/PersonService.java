package com.example.demo.service;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
   private IPersonaDAO personaDao;

   public Person save(Person p){
       return personaDao.save(p);
   }

   public Person update(Person p){
       return personaDao.save(p);
   }

   public void delete(Person p){
       personaDao.delete(p);
   }

   public Iterable<Person> list(){
       return personaDao.findAll();
   }
   public Optional<Person> findPersonById(long id){
       return personaDao.findById(id);
   }
}
