package com.mlcr.tree._589;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * @author: fynch3r
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
        List<Integer> result = new ArrayList<>();
        preN(root,result);
        return result;
    }

    public void preN(Node root,List<Integer> result) {
        if(root == null){
            return;
        }
        result.add(root.val);
        for(Node child:root.children){
            preN(child,result);
        }
    }
}
