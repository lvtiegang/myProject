package com.my.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyTestService {
    @Autowired
    private MyTestService myTestService;

    public String test() {
        return myTestService.test();
    }
}
