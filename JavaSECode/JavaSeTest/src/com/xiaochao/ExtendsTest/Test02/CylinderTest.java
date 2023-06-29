package com.xiaochao.ExtendsTest.Test02;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(3.4);
        cy.setLength(1.2);
        System.out.println("圆柱的体积为："+cy.findVolume());
        System.out.println("圆柱的表面积是："+cy.findArea());
    }
}
