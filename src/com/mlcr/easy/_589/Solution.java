package com.mlcr.easy._589;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * @author: 0range
 * @create: 2021-07-10 18:26
 **/


public class Solution {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> value = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        if (root != null) {
            deque.addLast(root);
        }
        while (!deque.isEmpty()) {
            Node current = deque.pollLast();
            value.add(current.val);
            // 倒序入栈
            for (int i = current.children.size() - 1; i >= 0; i--) {
                deque.addLast(current.children.get(i));
            }
        }
        return value;
    }
}
