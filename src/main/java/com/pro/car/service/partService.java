package com.pro.car.service;

import com.pro.car.bean.part;
import com.pro.car.mapper.partMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class partService {
    @Autowired
    partMapper p;
    public part findpart(String name){
        return p.findpart(name);
    }
}
