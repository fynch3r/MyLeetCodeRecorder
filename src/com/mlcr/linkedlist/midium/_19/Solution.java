package com.mlcr.linkedlist.midium._19;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/ 滑动窗口
 * @author: fynch3r
 * @create: 2022-03-24 09:54
 **/


public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0,head);
        prev.next = head;
        ListNode slow = prev;
        ListNode fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        //fast.next == null
        slow.next = slow.next.next;
        return prev.next;
    }
}
