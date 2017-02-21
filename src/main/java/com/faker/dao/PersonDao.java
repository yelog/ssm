package com.faker.dao;

import com.faker.model.Person;

import java.io.Serializable;
import java.util.List;

/**
 * Created by faker on 16-11-2.
 */
public interface PersonDao extends Dao<Person> {
    int add(Person person);

    int del(Person person);

    int update(Person person);

    Person findOneById(Serializable Id);

    List<Person> findAll();
}
