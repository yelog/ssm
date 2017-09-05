package com.faker.dao;

import com.faker.model.Person;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by faker on 16-11-2.
 */
@Component
public interface PersonDao extends Dao<Person> {
    int add(Person person);

    int del(Person person);

    int update(Person person);

    Person findOneById(Serializable Id);
}
