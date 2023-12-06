package com.xiaochao.algorithmTest;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-12-06  16:46
 * @Description: TODO
 * @Version: 1.0
 */
public class SubLong {
    public static int lengthLIS(int arr[]){
        int n = arr.length,Max=1;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
           for (int i = 1; i <n; i++)
           {
               for(int j = 0;j<i;j++)
                 if(arr[i]>arr[j])dp[i] = max(dp[j]+1,dp[i]);
               Max = max(Max, dp[i]);
           }
        return Max;
    }

    public static void main(String[] args) {
        SubLong sl = new SubLong();
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(sl.lengthLIS(arr));

    }
}
