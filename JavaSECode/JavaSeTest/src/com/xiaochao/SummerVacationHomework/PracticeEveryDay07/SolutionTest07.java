package com.xiaochao.SummerVacationHomework.PracticeEveryDay07;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEvetryDay07
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-08  10:58
 * @Description: TODO
 * @Version: 1.0
 */
public class SolutionTest07 {
    public static void main(String[] args) {
        Solution07 s7 = new Solution07();
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(s7.CheckPermutation(s1, s2));
        int arr[] = new int[]{2,7,4,1,8,1};
        System.out.println(s7.lastStoneWeight(arr));
    }
}
