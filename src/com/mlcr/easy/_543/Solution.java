package com.mlcr.easy._543;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * @author: fynch3r
 * @create: 2021-07-09 16:47
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

    int sum = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return sum;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int maxLeft = depth(node.left);
        int maxRight = depth(node.right);
        sum = Math.max(sum, maxLeft + maxRight);
        return Math.max(maxLeft, maxRight) + 1;
    }
}
