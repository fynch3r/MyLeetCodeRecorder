package com.mlcr.easy._225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/implement-stack-using-queues/
 * @author: fynch3r
 * @create: 2021-07-09 19:32
 **/


public class MyStack {

    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue  = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int n = queue.size();
        queue.add(x);
        // 循环压入栈中
        for (int i = 0; i < n; i++) {
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

}
