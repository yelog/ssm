package com.faker.service.impl;

import com.faker.data.PersonMapper;
import com.faker.model.po.Person;
import com.faker.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by faker on 5/22/17.
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    PersonMapper personMapper;

    public List<Person> listAll() {
        return personMapper.findAll();
    }

    public Person getById(Integer id) {
        return personMapper.findOneById(id);
    }

    public Integer delById(Person person) {
        return personMapper.del(person);
    }

    public Integer updatePerson(Person person) {
        return personMapper.update(person);
    }
}
