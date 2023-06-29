package com.xiaochao.object.equals.Test01;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.object.equals
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  18:38
 * @Description: TODO
 * @Version: 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order("Tom",1002);
        Order order2 = new Order("Tom",1002);
        System.out.println(order1.equals(order2));

        Order order3 = new Order(new String("Tom"),1002);
        Order order4 = new Order(new String("Tom"),1002);
        System.out.println(order3.equals(order4));
    }
}
