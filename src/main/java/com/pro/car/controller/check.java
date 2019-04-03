package com.pro.car.controller;

import com.pro.car.bean.Userid;
import com.pro.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check {
    @Autowired
    UserService user;
    @RequestMapping("/user/{id}")
    public Userid checkuser(@PathVariable("id") Integer id)
    {
        return user.findUser(id);
    }
}
