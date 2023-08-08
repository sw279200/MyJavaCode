package com.xiaochao.SummerVacationHomework.PracticeEveryDay10;

import java.util.*;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay10
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-11  10:30
 * @Description: TODO
 * @Version: 1.0
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution10 {
            public ListNode removeZeroSumSublists(ListNode head) {
                ListNode dummy = new ListNode(0);
                dummy.next = head;
                Map<Integer, ListNode> seen = new HashMap<>();
                int prefix = 0;
                for (ListNode node = dummy; node != null; node = node.next) {
                    prefix += node.val;
                    seen.put(prefix, node);
                }
                prefix = 0;
                for (ListNode node = dummy; node != null; node = node.next) {
                    prefix += node.val;
                    node.next = seen.get(prefix).next;
                }
                return dummy.next;
            }

    ListNode pre = new ListNode(0);
    ListNode cur = pre;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;

    }

}

