package com.mlcr.easy._237;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author: fynch3r
 * @create: 2021-06-11 14:21
 **/


public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
