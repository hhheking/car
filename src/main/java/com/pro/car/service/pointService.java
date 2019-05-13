package com.pro.car.service;

import com.pro.car.bean.point;
import com.pro.car.mapper.pointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class pointService {
    @Autowired
    pointMapper p;
    public ArrayList<point> findpoint(String name) {
        return p.findpoint(name);
    }
    public void insertpoint(point P){
        p.insertPoint(P);
    }
}
