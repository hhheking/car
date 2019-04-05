package com.pro.car.controller;

import com.pro.car.bean.Userid;
import com.pro.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class check {
    @Autowired
    UserService user;
    @RequestMapping(value = "/user")
    public boolean checkuser(@RequestParam("name") String name,@RequestParam("psw") String password)
    {
        Userid u = user.findUser(name);
        if(u.getPassword().equals(password))
            return true;
        else
            return false;
    }
}
