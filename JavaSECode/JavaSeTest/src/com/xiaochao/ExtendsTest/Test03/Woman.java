package com.xiaochao.ExtendsTest.Test03;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.ExtendsTest.Test03
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  16:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Woman extends Person {
    boolean isBeautiful;

    public Woman(){
        isBeautiful = true;
    }
    public void eat(){
        System.out.println("女人小口小口的吃饭");
    }

    public void walk(){
        System.out.println("女人跑步运动减肥");
    }

    public void sleep(){
        System.out.println("女人感觉无聊的睡着了");
    }

    public void dance(){
        System.out.println("女人高兴的跳着舞");
    }
}
