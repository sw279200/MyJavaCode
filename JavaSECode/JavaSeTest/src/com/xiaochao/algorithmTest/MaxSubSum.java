package com.xiaochao.algorithmTest;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-12-06  16:30
 * @Description: TODO
 * @Version: 1.0
 */
public class MaxSubSum {

   /* public static int MaxSum(int arr[]){
        int sum = 0,MaxSum=-0x3f3f3f3f;
        for (int i = 0; i < arr.length; i++) {
            if(sum+arr[i]<arr[i]) {
                sum = arr[i];
            }else{
                sum+=arr[i];
            }

            if(sum>MaxSum)
            {
              MaxSum = sum;
            }
        }

        return MaxSum<0? 0:MaxSum;
    }

    public static void main(String[] args) {
        MaxSubSum mss = new MaxSubSum();
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(mss.MaxSum(arr));
    }*/

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int sum = 0;
        int Max = 0;
        for(int j = 0;j<n;j++){
            if(sum+a[j]>=a[j]){
                sum+=a[j];
            }
            else{
                sum = a[j];
            }

            if(sum>Max){
                Max = sum;
            }
        }
        if(Max<0) Max = 0;
        System.out.println(Max);
    }
}
