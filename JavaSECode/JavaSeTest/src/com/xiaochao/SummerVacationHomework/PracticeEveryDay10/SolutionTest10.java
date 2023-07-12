package com.xiaochao.SummerVacationHomework.PracticeEveryDay10;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay10
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-11  10:30
 * @Description: TODO
 * @Version: 1.0
 */
public class SolutionTest10 {
    public static void main(String[] args) {
        Solution10 s10 = new Solution10();
        ListNode head = new ListNode(1);
        ListNode L1 = new ListNode(2);
        ListNode L2 = new ListNode(-3);
        ListNode L3 = new ListNode(3);
        ListNode L4= new ListNode(1);
        head.next = L1;
        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        L4.next = null;
        ListNode cur = s10.removeZeroSumSublists(head);
        while(cur!=null)
        {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
