package com.ssm.data.mapper;

import com.ssm.data.common.BaseMapper;
import com.ssm.model.person.po.Person;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by faker on 16-11-2.
 */
@Component
public interface PersonMapper extends BaseMapper<Person> {
    int add(Person person);

    int del(Person person);

    int update(Person person);

    Person findOneById(Serializable Id);

    List<Person> findAll();
}
