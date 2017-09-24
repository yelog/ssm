package com.ssm.service;

import com.ssm.data.PersonMapper;
import com.ssm.iservice.IPersonService;
import com.ssm.model.person.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:/conf/dubbo-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
