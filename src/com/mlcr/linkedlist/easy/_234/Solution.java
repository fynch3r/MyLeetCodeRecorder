package com.mlcr.linkedlist.easy._234;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/palindrome-linked-list/ 回文链表
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
        //ListNode left = head;
        //ListNode right = reverse(head);
        //while(left != null && right != null){
        //    if(left.val!=right.val){
        //        return false;
        //    }
        //    left = left.next;
        //    right = right.next;
        //}
        //return true;
    }

    public boolean isPalindromeInStack(ListNode head) {
        int length = 0;
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0;i<length/2;i++){
            stack.push(temp.val);
            temp = temp.next;
        }
        // 奇数需要跳过一个
        if(length%2 == 1){
            temp = temp.next;
        }
        //开始比较
        while(temp!=null){
            if(temp.val != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    //
    ////倒序
    //public ListNode reverse(ListNode head){
    //    ListNode prev = null;
    //    ListNode temp = null;
    //    ListNode curr = head;
    //    while(curr!= null){
    //        temp = curr.next;
    //        curr.next = prev;
    //        //前移
    //        prev = curr;
    //        curr = temp;
    //    }
    //    return prev;
    //}

    //双指针
    public boolean isPalindromeTwoPointer(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 数组长度为奇数
        if(fast!=null){
            slow = slow.next;
        }
        //slow代表了链表后半部分的开始
        slow = reverse(slow);
        //fast移动到前半部分头节点
        fast = head;
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }


    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
