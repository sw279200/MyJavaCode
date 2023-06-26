package com.xiaochao.ExtendsTest.Test01;

public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids();

        kid.setSalary(1000);
        kid.setSex(1);
        kid.setYearsOld(12);
        //来自父类中声明的方法

        kid.employeed();
        kid.manOrWoman();
        kid.printAge();
    }
}
