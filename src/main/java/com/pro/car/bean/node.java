package com.pro.car.bean;

import java.awt.*;

public class node implements Comparable{
    public int G;
    public int H;
    public Boolean flag;
    public int i;
    public int j;
    public Point p;
    public node parent;

    public node(){
        this.G = 9999;
    }

    @Override
    public int compareTo(Object o) {
        node n = (node) o;
        if (this.G + this.H > n.G + n.H)
            return 1;
        else if(this.G + this.H < n.G + n.H)
            return -1;
        else
            if(this.H > n.H)
                return 1;
            else
                return -1;
    }
}
