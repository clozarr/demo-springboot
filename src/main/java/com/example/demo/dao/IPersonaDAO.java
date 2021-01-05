package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDAO extends CrudRepository<Person, Long> {
}
