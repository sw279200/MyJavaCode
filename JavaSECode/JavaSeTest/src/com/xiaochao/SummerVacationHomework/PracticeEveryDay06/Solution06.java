package com.xiaochao.SummerVacationHomework.PracticeEveryDay06;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay06
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-07  22:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution06 {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        if(target<nums[0])
        {
            ans = 0;
            return ans;
        }
        if(target>nums[nums.length-1])
        {
            ans = nums.length;
            return ans;
        }
        for (int i = 0; i < nums.length; i++) {

            if(target==nums[i]){
                ans = i;
                break;
            }

            if(target>nums[i]&&target<nums[i+1]){
                ans = i+1;
                break;
            }


        }
        return ans;
    }
    
}
