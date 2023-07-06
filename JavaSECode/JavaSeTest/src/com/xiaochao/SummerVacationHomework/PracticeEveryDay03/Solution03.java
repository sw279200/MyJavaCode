package com.xiaochao.SummerVacationHomework.PracticeEveryDay03;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay03
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-04  10:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution03 {
    /**
     * @return boolean
     * @Author 锦猪
     * @Description 给定两个字符串 s1 和 s2 ，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符
     * 串。
     * @Date 14:01 2023/7/4
     * @Param [s1, s2]
     **/
    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;

        if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length())
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
            if (!isExit1[k]) {
                return false;
            }
        }
        return true;
    }

    public int removeElement(int[] nums, int val) {
        int dest = 0;
        int src = 0;
        while (dest < nums.length) {
            if (nums[dest] != val) {
                nums[src++] = nums[dest++];

            } else {
                dest++;
            }
        }
        return src;
    }

    public int romanToInt(String s) {
        int ans = 0;
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
        }

        for (int j = 0; j < s.length() - 1; j++) {
            if (arr[j] >= arr[j + 1]) {
                ans += arr[j];
            } else {
                ans -= arr[j];
            }

        }

        ans += arr[s.length() - 1];
        return ans;

 }
}
