package com.pro.car.service;

import com.pro.car.bean.Userid;
import com.pro.car.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper user;
    public Userid findUser(Integer id)
    {
        return user.findUser(id);
    }
}
