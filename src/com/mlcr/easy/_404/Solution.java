package com.mlcr.easy._404;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/sum-of-left-leaves/
 * @author: 0range
 * @create: 2021-07-09 15:43
 **/


public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return sum;
        }
        iteration(root);
        return sum;
    }

    private void iteration(TreeNode root) {
        if (root.left != null) {
            if (isLeafNode(root.left)) {
                sum += root.left.val;
            } else {
                iteration(root.left);
            }
        }

        if (root.right != null) {
            iteration(root.right);
        }
    }

    public boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }


}
