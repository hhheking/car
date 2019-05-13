package com.pro.car.controller;
import com.pro.car.bean.node;
import com.pro.car.bean.part;
import com.pro.car.bean.parting;
import com.pro.car.bean.point;
import com.pro.car.service.PartingService;
import com.pro.car.service.partService;
import com.pro.car.service.pointService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

@RestController
public class daohang {
    @Autowired
    PartingService parting;
    @Autowired
    pointService p;
    @Autowired
    partService ps;
    @RequestMapping(value = "/daohang")
    public String direct(@RequestParam("name") String name,@RequestParam("x") Integer startx,@RequestParam("y") Integer starty) throws IOException {
        parting pt = parting.findPart(name);
        if(pt == null)
            return "false";
        part Part = ps.findpart(pt.getPartname());
        ArrayList<point> points = p.findpoint(pt.getPartname());
        Point start = new Point(startx,starty);
        Point end = new Point(pt.getX(),pt.getY());
        node[][] map = new node[Part.getN()][Part.getM()];
        for(int i=0;i<Part.getN();i++)
            for(int j=0;j<Part.getM();j++){
                map[i][j] = new node();
                map[i][j].i = i;
                map[i][j].j = j;
                map[i][j].p = new Point(points.get(i*6+j).getX(),points.get(i*6+j).getY());
                map[i][j].flag = points.get(i*6+j).getFalg();
            }
        ArrayList<node> open = new ArrayList();
        ArrayList<node> close = new ArrayList();
        map[start.x][start.y].H = Math.abs(end.x - start.x) + Math.abs(end.y - start.y);//end(7,2)
        map[start.x][start.y].G = 0;
        map[start.x][start.y].parent = null;
        open.add(map[start.x][start.y]);
        node iter=null;
        java.awt.Point[] attitude = new java.awt.Point[4];
        for(int i=0;i<4;i++)
            attitude[i] = new java.awt.Point();
        attitude[0].x = 0;
        attitude[0].y = 1;
        attitude[1].x = 0;
        attitude[1].y = -1;
        attitude[2].x = 1;
        attitude[2].y = 0;
        attitude[3].x = -1;
        attitude[3].y = 0;
        int x,y;
        while(!open.isEmpty()){
            iter = open.get(0);
            if(iter.i == end.x && iter.j == end.y)
                break;
            for(int i=0;i<4;i++){
                x = iter.i + attitude[i].x;
                y = iter.j+attitude[i].y;
                if(x < 0 || x >14 || y < 0 || y > 5)
                    continue;
                if(map[x][y].flag == false)
                    continue;
                if(!close.contains(map[x][y])){
                    if(open.contains(map[x][y])){
                        if(map[x][y].G > iter.G + 1)
                            map[x][y].G = iter.G + 1;
                    }
                    else
                    {
                        map[x][y].H = Math.abs(x - end.x) + Math.abs(y - end.y);
                        map[x][y].parent = iter;
                        map[x][y].G = iter.G + 1;
                        open.add(map[x][y]);
                        Collections.sort(open);
                    }
                }
            }
            close.add(iter);
            open.remove(iter);
        }
        BufferedImage img=ImageIO.read(new FileInputStream("/usr/car/map.png"));
        Graphics2D g2d=(Graphics2D)img.getGraphics();
        //设置颜色和画笔粗细
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(4));
        while(iter.parent != null){
            g2d.drawLine(iter.p.x,iter.p.y,iter.parent.p.x,iter.parent.p.y);
            iter = iter.parent;
        }
        ImageIO.write(img, "PNG",new FileOutputStream("/usr/car/test.png"));
        byte[] data = null;
        InputStream in = new FileInputStream("/usr/car/test.png");
        data = new byte[in.available()];
        in.read(data);
        in.close();
         // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }
}


