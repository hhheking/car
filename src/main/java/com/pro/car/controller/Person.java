package com.pro.car.controller;

import com.pro.car.bean.userInfo;
import com.pro.car.service.userInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
    @Autowired
    userInfoService u;
    @RequestMapping(value = "/findUser")
    public userInfo find(@RequestParam("name") String name){
        userInfo info = u.findInfo(name);
        return info;
    }

    @RequestMapping(value = "/update_user")
    public void find(@RequestParam("name") String name,@RequestParam("u_name") String u_name,@RequestParam("sex") String sex,@RequestParam("phone") int phone,@RequestParam("email") String email,@RequestParam("age") int age){
        userInfo uInfo = new userInfo();
        uInfo.setSex(sex);
        uInfo.setPhone(phone);
        uInfo.setEmail(email);
        uInfo.setAge(age);
        uInfo.setName(name);
        u.update_info(uInfo);
    }

}
