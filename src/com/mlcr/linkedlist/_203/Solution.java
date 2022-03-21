package com.mlcr.linkedlist._203;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @author: fynch3r
 * @create: 2021-06-11 13:41
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

    public ListNode removeElements(ListNode head, int val) {
        // 哨兵节点
        ListNode watch = new ListNode();
        watch.next = head;

        ListNode now = head;
        ListNode prev = watch;
        while (now != null) {
            if (now.val == val) {
                prev.next = now.next;
            } else {
                prev = now;
            }
            now = now.next;
        }
        return watch.next;

    }

}
