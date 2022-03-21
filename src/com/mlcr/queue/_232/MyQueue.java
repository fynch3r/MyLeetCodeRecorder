package com.mlcr.queue._232;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @author: fynch3r
 * @create: 2021-07-09 20:02
 **/


public class MyQueue {

    Deque<Integer> inStack;// 输入栈 push
    Deque<Integer> outStack;// 输出栈 pop peek

    //每次 pop 或 peek 时，若输出栈为空则将输入栈的全部数据依次弹出并压入输出栈，这样输出栈从栈顶往栈底的顺序就是队列从队首往队尾的顺序。

    /** Initialize your data structure here. */
    public MyQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()) {
                outStack.addLast(inStack.pollLast());
            }
        }
        return outStack.pollLast();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()) {
                outStack.addLast(inStack.pollLast());
            }
        }
        return outStack.peekLast();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }


}
