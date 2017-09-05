package com.faker.controller;

import com.faker.model.po.Person;
import com.faker.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by faker on 5/16/17.
 */
@Controller
public class IndexController {

    @Autowired
    IPersonService personService;

    @RequestMapping("/index.html")
    public String index(Model model) {

        List<Person> list = personService.listAll();
        model.addAttribute("command",list);
        return "index";
    }
}
