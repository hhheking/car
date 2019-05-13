package com.pro.car.controller;

import com.pro.car.bean.parting;
import com.pro.car.service.PartingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class findParting {
    @Autowired
    PartingService p;
    @RequestMapping("/findStop")
    public parting findStop(@RequestParam("name") String name){
        parting recode = p.findPart(name);
        return recode;
    }

}
