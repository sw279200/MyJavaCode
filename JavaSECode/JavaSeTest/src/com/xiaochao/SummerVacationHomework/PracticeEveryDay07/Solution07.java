package com.xiaochao.SummerVacationHomework.PracticeEveryDay07;
import  java.util.Arrays;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEvetryDay07
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-08  10:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution07 {
    /**
     * @Author 锦猪
     * @Description 给定两个由小写字母组成的字符串 s1 和 s2，
     * 请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     * @Date 10:59 2023/7/8
     * @Param [s1, s2]
     * @return boolean
     **/
    public boolean CheckPermutation(String s1, String s2) {
        if(s1==null&&s2==null)
            return true;

        if(s1==null||s2==null)
            return false;

        if(s1.length()!=s2.length())
            return false;

        boolean isExit1[] = new boolean[s1.length()];
        boolean isExit2[] = new boolean[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (!isExit2[j] && s1.charAt(i) == s2.charAt(j)) {
                    isExit1[i] = true;
                    isExit2[j] = true;
                    break;
                }
            }
        }

        for (int k = 0; k < s1.length(); k++) {
            if(!isExit1[k]){
                return false;
            }
        }
        return true;
    }
    /**
     * @Author 锦猪
     * @Description 有一堆石头，每块石头的重量都是正整数。
     *
     * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为x 和y，且x <= y。
     * 那么粉碎的可能结果如下：
     * 如果x == y，那么两块石头都会被完全粉碎；
     * 如果x != y，那么重量为x的石头将会完全粉碎，而重量为y的石头新重量为y-x。
     * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
     *
     * @Date 11:03 2023/7/8
     * @Param [stones]
     * @return int
     **/
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for (int i = 0; i < stones.length - 1; i++){     //最多比较length-1次
            Arrays.sort(stones);
            if (stones[index - 1] == 0) break;           //说明最多只剩一块石头
            stones[index] -= stones[index - 1];          //两种不同情况使用同一表达式处理
            stones[index - 1] = 0;                       //每次比较后肯定会有一块石头被destroyed
        }
        return stones[index];
    }
}
