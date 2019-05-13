package com.pro.car.controller;

import com.pro.car.bean.parting;
import com.pro.car.service.PartingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class partstorage {
    @Autowired
    PartingService part;
    @RequestMapping(value = "/part")
    public void storage(@RequestParam("partname") String partname,@RequestParam("name") String name,@RequestParam("x") Integer x,@RequestParam("y") Integer y){
        parting p = new parting();
        p.setName(name);
        p.setPartname(partname);
        p.setX(x);
        p.setY(y);
        p.setTime(new Date());
        part.insertPart(p);
    }
}
