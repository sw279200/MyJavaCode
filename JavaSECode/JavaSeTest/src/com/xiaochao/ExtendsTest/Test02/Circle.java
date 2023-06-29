package com.xiaochao.ExtendsTest.Test02;

public class Circle {
    private double radius;
    public void Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * getRadius() * getRadius();
    }

}
