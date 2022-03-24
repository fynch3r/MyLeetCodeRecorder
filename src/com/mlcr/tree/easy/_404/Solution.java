package com.mlcr.tree.easy._404;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/sum-of-left-leaves/ 左叶子之和
 * @author: fynch3r
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
        adder(root);
        return sum;
    }

    private void adder(TreeNode root) {
        if (root.left != null) {
            if (isLeafNode(root.left)) {
                sum += root.left.val;
            } else {
                adder(root.left);
            }
        }

        if (root.right != null) {
            adder(root.right);
        }
    }

    public boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }


}
