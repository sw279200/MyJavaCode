package com.xiaochao.algorithmTest;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-08  17:23
 * @Description: TODO
 * @Version: 1.0
 */
public class MinK {

    public static void main(String[] args) {
        MinK  mink = new MinK();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++) arr[i]=scan.nextInt();
        int k = scan.nextInt();
        Arrays.sort(arr);
        System.out.println("第"+k+"小的元素："+arr[k-1]);
    }

}
