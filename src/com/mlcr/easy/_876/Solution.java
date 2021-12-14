package com.mlcr.easy._876;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author: 0range
 * @create: 2021-07-14 19:19
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

    public ListNode middleNode(ListNode head) {
        ListNode[] list = new ListNode[100];
        int i = 0;
        while(head!=null){
            list[i++] = head;
            head = head.next;
        }
        return list[i/2];
    }
}
