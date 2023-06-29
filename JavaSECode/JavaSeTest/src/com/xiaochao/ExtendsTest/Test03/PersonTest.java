package com.xiaochao.ExtendsTest.Test03;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.ExtendsTest.Test03
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  16:54
 * @Description: TODO
 * @Version: 1.0
 */
public class PersonTest {

    public static void main(String[] args) {
       PersonTest pt = new PersonTest();
       pt.adopt(new Man(),new Woman(),new Man());

    }

    public void adopt(Person ... p){
        for (int i = 0; i < p.length; i++) {
            p[i].eat();
            p[i].sleep();
            p[i].walk();

            if(p[i] instanceof Woman){
                Woman woman = (Woman)p[i];
                woman.dance();
            }

            if(p[i] instanceof Man){
                Man man = (Man)p[i];
                man.play();
            }
        }
    }
}
