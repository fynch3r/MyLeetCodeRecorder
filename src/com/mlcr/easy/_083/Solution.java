package com.mlcr.easy._083;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @author: 0range
 * @create: 2021-06-10 16:51
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
