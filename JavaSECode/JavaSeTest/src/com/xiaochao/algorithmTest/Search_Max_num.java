package com.xiaochao.algorithmTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-22  17:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Search_Max_num {

    public  static int MaxCountNum(int []arr){
        int count = 1,num = arr[0],MaxCount = 1,x = arr[0];

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(x==arr[i]) count++;
            else{
                if(count>MaxCount) {
                    MaxCount = count;
                    num = arr[i-1];
                }
                count = 1;
                x = arr[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Search_Max_num smn = new Search_Max_num();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("出现次数最多的且最小的数为:"+smn.MaxCountNum(arr));
    }
}
