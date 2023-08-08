package com.xiaochao.SummerVacationHomework.PracticeEveryDay11;


/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay11
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-12  10:59
 * @Description: TODO
 * @Version: 1.0
 */
public class SolutionTest11 {
    public static void main(String[] args) {
        Solution11 s11 = new Solution11();
        ListNode head = new ListNode(1);
        ListNode L1 = new ListNode(2);
        ListNode L2 = new ListNode(3);
        ListNode L3 = new ListNode(4);
        ListNode L4= new ListNode(5);
        head.next = L1;
        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        L4.next = null;

        ListNode cur = s11.oddEvenList(head);
        while(cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
