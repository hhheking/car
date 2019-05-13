package com.pro.car.controller;

import com.pro.car.bean.Userid;
import com.pro.car.bean.userInfo;
import com.pro.car.service.UserService;
import com.pro.car.service.userInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registe {
    @Autowired
    UserService user;
    @Autowired
    userInfoService uinfo;
    @RequestMapping(value = "/registe")
    public boolean registe(@RequestParam("name") String name, @RequestParam("psw") String password)
    {
        Userid u = user.findUser(name);
        if(u != null) {
            return false;
        }
        else
        {
            u = new Userid();
            u.setName(name);
            u.setPassword(password);
            user.insertUser(u);
            userInfo uInfo = new userInfo();
            uInfo.setName(name);
            uInfo.setAge(0);
            uInfo.setEmail("");
            uInfo.setPhone(0);
            uInfo.setSex("");
            uinfo.insertInfo(uInfo);
            return true;
        }
    }
}
