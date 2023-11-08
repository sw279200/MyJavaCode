package com.xiaochao.algorithmTest;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-08  17:39
 * @Description: TODO
 * @Version: 1.0
 */
public class MIdNum {

   /* public  void printArr(int arr[],int left,int right){
        for (int i = left; i <=right; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void midNum(int arr[],int left,int right){
        if(left>=right) return;
       int mid = left+(right-left)/2;

    }*/


    int mid(int a[],int s1,int t1,int b[],int s2,int t2){
        int m1,m2,m;
        if(s1==t1 && s2==t2) {
            return a[s1]<b[s2]?a[s1]:b[s2];//只有一个元素返回最小者
        }
        else
        {
            m1=(s1+t1)/2;  //求a 、b中位数
            m2=(s2+t2)/2;
            if(a[m1]==b[m2])
                return a[m1];
            if(a[m1]<b[m2]){
                System.out.print("a:");
                m=(s1+t1)/2;    //后半序列
                if((s1+t1)%2==0)   //序列中有奇数元素
                    s1=m;
                else    //序列中有偶数个元素
                    s1=m+1;
                for(int i = s1;i<=t1;i++) System.out.print(a[i]+" ");
                System.out.println();
                System.out.print("b:");
                m=(s2+t2)/2;  //前半子序列
                t2=m;
                for(int i = s2;i<=t2;i++) System.out.print(b[i]+" ");
                System.out.println();  //取b前半部分
                return mid(a,s1,t1,b,s2,t2);
            }
            else{
                System.out.print("a:");
                m=(s1+t1)/2;  //前半子序列
                t1=m;
                for(int i = s1;i<=t1;i++) System.out.print(a[i]+" ");
                System.out.println();  //取b前半部分
                System.out.print("b:");
                m=(s2+t2)/2;    //后半序列
                if((s2+t2)%2==0)   //序列中有奇数元素
                    s2=m;
                else    //序列中有偶数个元素
                    s2=m+1;
                for(int i = s2;i<=t2;i++) System.out.print(b[i]+" ");
                System.out.println();//取b后半部分
                return mid(a,s1,t1,b,s2,t2);
            }
        }
    }

    public static void main(String[] args) {
        MIdNum mn = new MIdNum();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=scan.nextInt();
        }

        System.out.println("中位数:"+mn.mid(a,0,n-1,b,0,n-1));
    }
}
