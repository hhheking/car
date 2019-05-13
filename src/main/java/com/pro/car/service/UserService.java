package com.pro.car.service;

import com.pro.car.bean.Userid;
import com.pro.car.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper user;
    public Userid findUser(String name)
    {
        return user.findUser(name);
    }
    public void insertUser(Userid u)
    {
        user.insertUser(u);
    }

}
