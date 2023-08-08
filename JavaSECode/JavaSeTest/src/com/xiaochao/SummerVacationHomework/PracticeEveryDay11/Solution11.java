package com.xiaochao.SummerVacationHomework.PracticeEveryDay11;
import  java.util.Arrays;
/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay11
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-12  10:59
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution11 {
    /**
     * @Author 锦猪
     * @Description 
     * @Date 11:44 2023/7/12
     * @Param [head]
     * @return com.xiaochao.SummerVacationHomework.PracticeEveryDay11.ListNode
     **/
    public ListNode sortList(ListNode head) {
        if(head==null)
            return null;
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }

        int arr[] = new int[count];
        cur = head;
        int i = 0;
        while(cur!=null){
            arr[i++] = cur.val;
            cur = cur.next;
        }

        Arrays.sort(arr);
        cur = head;
        i = 0;
        while(cur!=null){
           cur.val = arr[i++];
           cur = cur.next;
        }

        return head;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
