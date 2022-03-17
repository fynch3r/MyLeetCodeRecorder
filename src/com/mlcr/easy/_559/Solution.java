package com.mlcr.easy._559;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * @author: fynch3r
 * @create: 2021-07-12 20:53
 **/


public class Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }else if (root.children.isEmpty()) {
            return 1;
        }else{
            ArrayList<Integer> heights = new ArrayList<>();
            for (Node child : root.children) {
                heights.add(maxDepth(child));
            }
            return Collections.max(heights) + 1;
        }
    }

}
