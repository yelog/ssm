package com.ssm.controller;

import com.alibaba.dubbo.rpc.RpcContext;
import com.ssm.iservice.IPersonService;
import com.ssm.model.person.po.Person;
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
        RpcContext.getContext().setAttachment("index", "1");//测试ThreadLocal
        List<Person> list = personService.selectList(null);
        model.addAttribute("command",list);
        return "index";
    }
}
