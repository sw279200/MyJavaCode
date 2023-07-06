package com.xiaochao.SummerVacationHomework.PracticeEveryDay03;
import java.lang.*;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay03
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-04  11:54
 * @Description: TODO
 * @Version: 1.0
 */
public class SolutionTest03 {
    public static void main(String[] args) {
        Solution03 s = new Solution03();
        String s1 = "abc";
        String s2 = "bcd";
        System.out.println(s.CheckPermutation(s1,s2));

        int [] arr = new int[]{1,2,2,2,3,4,5,5,5,6};
        System.out.println(s.removeElement(arr,2));

        String s3 = "MCMXCIV";
        System.out.println(s.romanToInt(s3));


    }
}
