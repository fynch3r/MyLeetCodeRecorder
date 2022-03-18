package com.mlcr.linkedlist._021;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author: fynch3r
 * @create: 2021-06-10 15:50
 **/

/**
 * 两个链表已经有序
 * 递归：
 * if(l1.val<=l2.val)，此时l1.next需要指向l1.next和l2之中更小的那个,返回l1, l1.next = merge(l1.next,l2)
 * if(l1.val > l2.val), 此时l2更小，需要指向l1和l2.next之中更小的那个，返回l2，l2.next = merge(l1,l2.next)
 */

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


}
