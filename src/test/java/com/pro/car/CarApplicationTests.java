package com.pro.car;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.pro.car.service.pointService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarApplicationTests {
    @Autowired
    pointService p;
    @Test
    public void contextLoads() throws IOException{
//        System.load(System.getProperty("user.dir")+"/src/main/resources/opencv/x64/opencv_java400.dll");
//        Mat img = Imgcodecs.imread(System.getProperty("user.dir")+"/src/main/resources/static/map.png");
//        Imgproc.line(img,new org.opencv.core.Point(45,45),new Point(45,303), new Scalar(255, 0, 0),5,8);
//        Imgcodecs.imwrite(System.getProperty("user.dir")+"/src/main/resources/static/1.png",img);

//        point P = new point();
//            for(int j=0;j<5;j++)
//                for(int i=0;i<6;i++){
//                if(j%2 == 1 && i>0 && i<5)
//                    P.setFalg(false);
//                else
//                    P.setFalg(true);
//                P.setPartname("停车场");
//                P.setX(45+46*i);
//                P.setY(45+ 46*j);
//                p.insertpoint(P);
//            }
//        for(int i=0;i<6;i++){//第六行
//            if(i==0)
//                P.setFalg(true);
//            else
//                P.setFalg(false);
//            P.setPartname("停车场");
//            P.setX(45+46*i);
//            P.setY(45+ 46*5);
//            p.insertpoint(P);
//        }
//        for(int i=0;i<6;i++){//第七行
//            P.setFalg(true);
//            P.setPartname("停车场");
//            P.setX(45+46*i);
//            P.setY(45+ 46*5+23);
//            p.insertpoint(P);
//        }
//        for(int i=0;i<6;i++){//第八行
//            if(i==0)
//                P.setFalg(true);
//            else
//                P.setFalg(false);
//            P.setPartname("停车场");
//            P.setX(45+46*i);
//            P.setY(45+ 46*6);
//            p.insertpoint(P);
//        }
//        for(int j=7;j<14;j++)
//            for(int i=0;i<6;i++){
//                if(j%2 == 0 && i>0 && i<5)
//                    P.setFalg(false);
//                else
//                    P.setFalg(true);
//                P.setPartname("停车场");
//                P.setX(45+46*i);
//                P.setY(45+ 46*j);
//                p.insertpoint(P);
//            }
    }
}

