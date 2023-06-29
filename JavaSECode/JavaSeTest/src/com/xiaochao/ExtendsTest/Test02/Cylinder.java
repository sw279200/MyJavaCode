package com.xiaochao.ExtendsTest.Test02;

public class Cylinder extends Circle {
    private double length;
    public void Cylinder(){
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea() * getLength();
    }


    public double findArea(){
        return super.findArea()*2+3.14 * getRadius()*2*getLength();
    }
}
