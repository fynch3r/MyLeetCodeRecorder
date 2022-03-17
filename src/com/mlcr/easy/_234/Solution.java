package com.mlcr.easy._234;

import java.util.ArrayList;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/palindrome-linked-list/
 * @author: fynch3r
 * @create: 2021-07-09 14:30
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

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            vals.add(current.val);
            current = current.next;
        }

        int front = 0;
        int end = vals.size() - 1;
        while (front < end) {
            if (!vals.get(front).equals(vals.get(end))) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }
}
