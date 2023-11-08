package com.xiaochao.algorithmTest;

import java.util.Scanner;


/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.algorithmTest
 * @Author: 锦猪好有味
 * @CreateTime: 2023-11-08  16:28
 * @Description: TODO
 * @Version: 1.0
 */
public class Int_array_split_empty {

    public  int array_split(int arr[],int start,int end){
        int left = start,right = end;
        int key = arr[left];

        while(left<right)
        {
            while(left<right&&arr[right]>=key) right--;
            arr[left] = arr[right];
            while(left<right&&arr[left]<=key)  left++;
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }

    public int solve(int arr[],int n){
        int low=0,high=n-1;
        boolean flag=true;
        while(flag) {
            int i=array_split(arr,low,high);
            if(i==n/2-1) flag=false;
            else if(i<n/2-1) low=i+1;
            else high=i-1;
        }
        int s1=0,s2=0;
        for(int i=0;i<n/2;i++) s1+=arr[i];
        for(int j=n/2;j<n;j++) s2+=arr[j];
        return s2-s1;
    }

    void display(int arr[],int left,int right){
        for(int i=left;i<=right;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Int_array_split_empty iase = new Int_array_split_empty();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("求解结果："+iase.solve(arr,n));
        System.out.print("划分结果：A1：");
        iase.display(arr,0,n/2-1);
        System.out.print("A2：");
        iase.display(arr,n/2,n-1);

    }
}
