package com.xiaochao.SummerVacationHomework.PraticeEveryDay04;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PraticeEveryDay04
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-05  09:41
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution04 {
    public int getNext(int n){
        int quadraticSum = 0;
        while(n>0){
            int count = n%10;
            n/=10;
            quadraticSum+=count*count;

        }
        return quadraticSum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while(fast!=1&&slow!=fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast==1;
    }

    public boolean isUgly(int n) {
        boolean flag = false;
        while(n>=1){
            if(n==1)
            {
                flag = true;
                break;
            }

            if(n%5==0||n%3==0||n%2==0){
                if(n%5==0){
                    n/=5;
                }

                if(n%3==0){
                    n/=3;
                }

                if(n%2==0){
                    n/=2;
                }
            }else{
                break;
            }
        }
        return flag;
    }
}
