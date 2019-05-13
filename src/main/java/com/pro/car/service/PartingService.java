package com.pro.car.service;

import com.pro.car.bean.parting;
import com.pro.car.mapper.PartingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartingService {
    @Autowired
    PartingMapper part;
    public parting findPart(String name){return part.findpart(name);}
    public void insertPart(parting p){part.insertPart(p);}
}
