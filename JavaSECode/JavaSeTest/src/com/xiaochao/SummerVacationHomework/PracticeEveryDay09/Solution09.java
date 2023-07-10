package com.xiaochao.SummerVacationHomework.PracticeEveryDay09;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.SummerVacationHomework.PracticeEveryDay09
 * @Author: 锦猪好有味
 * @CreateTime: 2023-07-10  09:54
 * @Description: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * @Version: 1.0
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution09{
    /**
     * @Author 锦猪
     * @Description 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * @Date 10:25 2023/7/10
     * @Param [head]
     * @return int[]
     **/
    public int[] reversePrint(ListNode head) {
        if(head==null)
        {
            int []arr = new int[0];
            return arr;
        }
        ListNode ln = head;
        int len = 0;
        while(ln!=null){
            ln = ln.next;
            len++;
        }
        int []arr = new int[len];
        int i = 0;
        ListNode cur = head;
        while(cur!=null){
            arr[i++]=cur.val;
            cur = cur.next;
        }
        int left= 0,right = i-1;
        for(;left<right;left++,right--)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        return arr;
    }

    public ListNode removeDuplicateNodes(ListNode head) {
            if(head==null)
                return null;

            ListNode cur = head;
            ListNode tail = head;
            ListNode newcur = head;
            ListNode last = cur.next;

            cur = last;
            if(last!=null)
                last = last.next;

            head.next = null;
            while(cur!=null){
                newcur = head;
                boolean flag= false;
                while(newcur!=null){
                    if(cur.val==newcur.val){
                        flag = true;
                        break;
                    }
                    newcur = newcur.next;

                }
                if(!flag){
                    tail.next = cur;
                    tail = tail.next;
                }
                cur.next = null;
                cur = last;
                if(last!=null){
                    last = last.next;
                }
            }
            return head;
    }
}
