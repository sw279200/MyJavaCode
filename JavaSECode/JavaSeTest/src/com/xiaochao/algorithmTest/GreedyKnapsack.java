package com.xiaochao.algorithmTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-22  16:57
 * @Description: TODO
 * @Version: 1.0
 */


public class GreedyKnapsack {
    //该类的构造函数
    GreedyKnapsack(int weight,int price ,double perf,double scale){
        this.weight = weight;
        this.price = price;
        this.perf = perf;
        this.scale = scale;
    }
    //该类的各个属性
    private int weight;//重量
    private int price;//价值
    private double perf;//权重比

    private double scale;//最优解对应的该物品装入到背包中的重量

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPerf() {
        return perf;
    }

    public void setPerf(double perf) {
        this.perf = perf;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();//输入背包容量
        int n = scan.nextInt();//输入物品数量
        int priceArr[] = new int[n];//定义用来存放价值的数组
        int weightArr[] = new int[n];//定义用来存放重量的数组
        for (int i = 0; i < n; i++) {
            weightArr[i] = scan.nextInt();//输入各个物品对应的重量
            priceArr[i] = scan.nextInt();//输入各个物品对应的价值
        }

        double perf[] = new double[n];//定义用来存放价值/重量的权重比例数组：表示一定重量下该物品对应的价值
        for (int i = 0; i < n; i++) {
            perf[i] = (double)priceArr[i]/(double)weightArr[i];//求出每个物品对应的权重比并放到数组中
        }

        GreedyKnapsack nt[] = new GreedyKnapsack[n];//定义一个该类的数组,用来存放对应的物品，一个物品对应一个对象
        for (int i = 0; i < n; i++) {
            //初始化该物品对象，并为其赋值
            GreedyKnapsack gk = new GreedyKnapsack(weightArr[i],priceArr[i],perf[i],0.00);
            nt[i] = gk;
        }
        //按照权重比从大到小给这些物品进行降序排序
        Arrays.sort(nt, new Comparator<GreedyKnapsack>() {
            @Override
            public int compare(GreedyKnapsack o1, GreedyKnapsack o2) {
                if(o1.getPerf() - o2.getPerf() >0.00){
                    return -1;
                }else if(o1.getPerf() - o2.getPerf() ==0.00){
                    return 0;
                }else if(o1.getPerf() - o2.getPerf() <0.00){
                    return 1;
                }

                return 0;
            }
        });

        int i = 0;
        double totalPrice = 0.00;//用来保存背包所放物品的最大价值
        //如果背包剩余的可装物品的重量大于该物品的重量，那就直接把整个物品装进去
        while(W>=nt[i].getWeight()){
            W-=nt[i].getWeight();//更新背包可装物品的剩余重量
            nt[i].setScale(1.00);//最优解对应的该物品装入到背包中的重量,因为该物品全部放进去了，所以设置为1.00
            totalPrice+=nt[i].price;//更新背包装入物品的总价值
            i++;
        }
        //剩下的就是不能够将整个物品装进去的价值，只能装一部分
        nt[i].setScale(1.00*W/nt[i].getWeight());//更新最优解对应的该物品装入到背包中的重量
        totalPrice+=W*nt[i].getPerf();//更新背包装入物品的总价值
        System.out.println("背包容量：物品个数：请分别输入物品的重量和价值：");
        System.out.print("最优解：");
        //按照题目要求输出最优解
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if(perf[j]==nt[k].perf){
                    System.out.printf("%.2f ",nt[k].getScale());
                }
            }
        }
        System.out.println();
        System.out.printf("总价值：%.2f ",totalPrice);
    }

}
