package com.xiaochao.SummerVacationHomework.PracticeEveryDay05;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay05
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-07  19:19
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution05 {
    /**
     * @Author 锦猪
     * @Description 
     * @Date 21:12 2023/7/7
     * @Param [num]
     * @return int
     **/
    public int addDigits(int num) {
        if(num<10)
            return num;
        int count = 0;
        while(num>0)
        {
            count+=num%10;
            num/=10;
        }
        return addDigits(count);
    }
}
