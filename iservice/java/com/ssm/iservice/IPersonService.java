package com.ssm.iservice;


import com.baomidou.mybatisplus.service.IService;
import com.ssm.model.person.po.Person;

import java.util.List;

/**
 * Created by faker on 5/22/17.
 */
public interface IPersonService extends IService<Person>{

    List<Person> listAll();
    Person getById(Integer id);
    Integer delById(Person person);
    Integer updatePerson(Person person);
}
