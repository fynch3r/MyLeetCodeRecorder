package com.mlcr.stack._155;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/min-stack/ 最小栈
 * @author: fynch3r
 * @create: 2021-06-11 10:29
 **/


public class Solution {
    class MinStack {

        /** initialize your data structure here. */
        Deque<Integer> xStack;
        Deque<Integer> minStack;

        public MinStack() {
            xStack = new LinkedList<Integer>();
            minStack = new LinkedList<Integer>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            xStack.push(x);
            minStack.push(Math.min(minStack.peek(), x));
        }

        public void pop() {
            xStack.pop();
            minStack.pop();
        }

        public int top() {
            return xStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
