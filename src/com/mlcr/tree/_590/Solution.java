package com.mlcr.tree._590;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/ N 叉树的后序遍历
 * @author: fynch3r
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
        ArrayList<Integer> result = new ArrayList<>();
        postN(root, result);
        return result;
    }

    private void postN(Node root, List<Integer> result) {
        if(root == null){
            return;
        }
        for(Node child:root.children){
            postN(child, result);
        }
        result.add(root.val);
    }

}
