package com.xiaochao.SummerVacationHomework.PracticeEveryDay09;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay09
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-10  09:54
 * @Description: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * @Version: 1.0
 */
public class SolutionTest09 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(3);
        ListNode h2 = new ListNode(2);
        head.next = h1;
        h1.next = h2;
        h2.next = null;
        Solution09 s9 = new Solution09();
        for (int i = 0; i < s9.reversePrint(head).length; i++) {
                System.out.println(s9.reversePrint(head)[i]);
        }
        System.out.println("****************************************");
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(2);
        ListNode L3 = new ListNode(3);
        ListNode L4 = new ListNode(3);
        ListNode L5 = new ListNode(2);
        ListNode L6 = new ListNode(1);

        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        L4.next = L5;
        L5.next = L6;
        L6.next = null;
        ListNode L = s9.removeDuplicateNodes(L1);
        while(L!=null){
            System.out.println(L.val);
            L = L.next;
        }

    }
}
