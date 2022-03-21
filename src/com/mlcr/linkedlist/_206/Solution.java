package com.mlcr.linkedlist._206;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-linked-list/ 反转链表
 * @author: fynch3r
 * @create: 2021-06-11 15:34
 **/


public class Solution {
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            // prev 和 curr一起向前移动
            prev = curr;
            curr = next;
        }
        return prev;

    }
}
