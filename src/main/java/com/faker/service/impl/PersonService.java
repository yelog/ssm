package com.faker.service.impl;

import com.faker.dao.PersonDao;
import com.faker.model.Person;
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
    PersonDao personDao;

    public List<Person> listAll() {
        return personDao.findAll();
    }

    public Person getById(Integer id) {
        return personDao.findOneById(id);
    }

    public Integer delById(Person person) {
        return personDao.del(person);
    }

    public Integer updatePerson(Person person) {
        return personDao.update(person);
    }
}
