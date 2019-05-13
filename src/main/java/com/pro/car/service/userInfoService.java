package com.pro.car.service;

import com.pro.car.bean.userInfo;
import com.pro.car.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userInfoService {
    @Autowired
    UserInfoMapper uim;
    public userInfo findInfo(String name){
        return uim.findInfo(name);
    }
    public void insertInfo(userInfo u){
        uim.InsertInfo(u);
    }
    public void update_info(userInfo u){
        uim.update_userinfo(u);
    }
}
