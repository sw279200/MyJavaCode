package com.xiaochao.SummerVacationHomework.PracticeEveryDay02;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay02
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-03  17:55
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    /**
     * @Author 锦猪
     * @Description 截断句子
     * @Date 18:24 2023/7/3
     * @Param [s, k]
     * @return java.lang.String
     **/
    public String truncateSentence(String s, int k) {
        String res = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                k--;
            }
            if(k>0){
                res+=s.charAt(i);
            }

        }
        return res;
    }
}
