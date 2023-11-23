package com.xiaochao.algorithmTest;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-22  16:35
 * @Description: TODO
 * @Version: 1.0
 */
public class SmallChange {
    public static void oddChange(int n){
        int hundred = 0, fifty = 0,twenty = 0,ten = 0,five = 0,two = 0,one = 0;
        while(n!=0){
            if(n>=100){
                n-=100;
                hundred++;
            }else if(n>=50&&n<100){
                n-=50;
                fifty++;
            }else if(n>=20&&n<50){
                n-=20;
                twenty++;
            }else if(n>=10&&n<20){
                n-=10;
                ten++;
            }else if(n>=5&&n<10){
                n-=5;
                five++;
            }else if(n>=2&&n<5){
                n-=2;
                two++;
            }else if(n==1){
                n-=1;
                one++;
            }
        }

        System.out.println("100元 "+hundred+"张");
        System.out.println("50元 "+fifty+"张");
        System.out.println("20元 "+twenty+"张");
        System.out.println("10元 "+ten+"张");
        System.out.println("5元 "+five+"张");
        System.out.println("2元 "+two+"张");
        System.out.println("1元 "+one+"张");
    }

    public static void main(String[] args) {
        SmallChange sc = new SmallChange();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sc.oddChange(n);
    }
}
