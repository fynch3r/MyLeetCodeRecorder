package com.mlcr.easy._160;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @author: 0range
 * @create: 2021-06-11 10:32
 **/


public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;

        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

}
