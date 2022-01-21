package com.mlcr.easy._563;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-tree-tilt/
 * @author: 0range
 * @create: 2021-07-12 21:09
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

    int slope = 0;

    public int findTilt(TreeNode root) {
        traversal(root);
        return slope;
    }

    public int traversal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traversal(root.left);
        int right = traversal(root.right);
        slope += Math.abs(left - right);
        return root.val + left + right;
    }

}