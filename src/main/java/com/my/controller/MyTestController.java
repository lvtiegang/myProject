package com.my.controller;

import com.my.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MyTestController {
    @Autowired
    private MyTestService myTestService;


    @RequestMapping("/index")
    public String index(){
        System.out.println(myTestService.test());
        return "../index";
    }
}
