package com.mlcr.linkedlist.easy._141;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/linked-list-cycle/
 * @author: fynch3r
 * @create: 2021-06-11 09:39
 **/


public class Solution {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();

        while (head != null) {
            // 如果返回false 就是访问过了 就是成环了
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;

    }

}
