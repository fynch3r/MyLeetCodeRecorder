package com.mlcr.easy._590;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * @author: 0range
 * @create: 2021-07-10 18:50
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

    public List<Integer> postorder(Node root) {
        ArrayList<Integer> value = new ArrayList<>();
        post(root, value);
        return value;
    }

    private void post(Node root, List<Integer> value) {
        if (root != null) {
            for (Node current : root.children) {
                if (current != null) {
                    post(current, value);
                }
            }
            value.add(root.val);
        }
    }

}
