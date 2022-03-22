package com.mlcr.number._1290;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @author: fynch3r
 * @create: 2021-06-12 16:22
 **/


public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(head.val);
            head = head.next;
        }
        int result = Integer.valueOf(s.toString(), 2);
        return result;
    }
}
