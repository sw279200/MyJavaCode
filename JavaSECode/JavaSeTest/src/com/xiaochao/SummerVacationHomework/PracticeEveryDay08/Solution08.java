package com.xiaochao.SummerVacationHomework.PracticeEveryDay08;

import java.util.Arrays;
import java.lang.Math;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay08
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-09  10:58
 * @Description: TODO
 * @Version: 1.0
 */
class Solution08 {
    /**
     * @Author 锦猪
     * @Description 输入：words = ["cat","bt","hat","tree"], chars = "atach"
     * 输出：6
     * 解释：
     * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
     *
     * @Date 12:18 2023/7/9
     * @Param [words, chars]
     * @return int
     **/
    public int countCharacters(String[] words, String chars) {
        int Sumlen = 0;
        int arr2[] = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            arr2[chars.charAt(i)-'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            int arr1[] = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                arr1[words[i].charAt(j)-'a']++;
            }
            boolean flag =true;
            for (int k = 0; k < 26; k++) {
                if(arr1[k]>arr2[k]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                Sumlen+=words[i].length();
            }
        }

        return Sumlen;
    }
    /**
     * @Author 锦猪
     * @Description 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个
     * 现行公元纪年法 日期。返回该日期是当年的第几天。
     * @Date 12:25 2023/7/9
     * @Param [date]
     * @return int
     **/
    public int dayOfYear(String date) {
        int count = 0;
        int year = 0;
        for (int i = 0; i < 4; i++) {
            year+=(date.charAt(i)-'0')*(int)Math.pow(10,3-i);
        }
        int Month[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0&&year%100!=0||(year%400==0)){
            Month[1] = 29;
        }

        int month = 0;
        int day = 0;

        month = (date.charAt(5)-'0')*10+(date.charAt(6)-'0');
        day = (date.charAt(date.length()-2)-'0')*10+(date.charAt(date.length()-1)-'0');
        for(int i = 1;i<month;i++){
            count+=Month[i-1];
        }
        count+=day;
        return count;
    }
}
