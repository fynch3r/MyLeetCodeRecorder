package com.mlcr.easy._206;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-linked-list/
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
        ListNode now = head;
        while (now != null) {
            ListNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }
}
