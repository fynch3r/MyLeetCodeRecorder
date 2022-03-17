package com.mlcr.easy._144;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @author: fynch3r
 * @create: 2021-06-11 10:00
 **/


public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preOrder(root, result);
        return result;
    }

    public void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

}
