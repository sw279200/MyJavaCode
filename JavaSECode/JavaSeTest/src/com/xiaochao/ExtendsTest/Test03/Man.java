package com.xiaochao.ExtendsTest.Test03;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.ExtendsTest.Test03
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  16:39
 * @Description: TODO
 * @Version: 1.0
 */
public class Man extends Person {
    boolean isSmoking;

    public Man(){
        isSmoking = false;
    }
    public void eat(){
        System.out.println("男人大口大口的吃饭");
    }
    public void walk(){
        System.out.println("男人跑步做运动强身健体");
    }
    public void sleep(){
        System.out.println("男人工作累的睡着了");
    }
    public void play(){
        System.out.println("男人打篮球");
    }
}
