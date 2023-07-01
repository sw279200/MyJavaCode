package com.xiaochao.SummerVacationHomework.PracticeEveryDay01;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.summerVacationHomework.PracticeEveryDay01
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-30  11:41
 * @Description:
 *                1、给定一个长度为 n 的字符串，请编写一个函数判断该字符串是否回文。
 *               如果是回文请返回true，否则返回false。字符串回文指该字符串正序与其逆序逐字符一致。
 * @Version: 1.0
 */
public class SolutionTest1 {
    /**
     * @Author 锦猪
     * @Description 
     * @Date 12:11 2023/6/30
     * @Param [str]
     * @return boolean
     **/
    public boolean judge (String str) {
        // write code here
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    /**
     * @Author 锦猪
     * @Description 
     * @Date 12:11 2023/6/30
     * @Param [x]
     * @return int
     **/
    public int sqrt(int x){
        if(x< 0)return -1; //NaN = not a number
        double err = 1e-15; //误差控制在10的-15次方
        double t = x;
        while(Math.abs(t - x/t) > err*t){
            t = (x/t + t) / 2.0;
        }
        return (int)t;
    }
}
