package com.xiaochao.object.equals.Test02;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.object.equals.Test02
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  19:04
 * @Description: equals方法的测试
 * @Version: 1.0
 */
public class equalsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(29,6,2023);
        MyDate m2 = new MyDate(29,6,2023);

        if(m1.equals(m2)){
            System.out.println("m1 is equals of m2");
        }else{
            System.out.println("m1 is no equals of m2");
        }



    }
}
