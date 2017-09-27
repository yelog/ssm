package com.ssm.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.data.mapper.PersonMapper;
import com.ssm.iservice.IPersonService;
import com.ssm.model.person.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by faker on 5/22/17.
 */
@Service
public class PersonService extends ServiceImpl<PersonMapper, Person> implements IPersonService {

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
