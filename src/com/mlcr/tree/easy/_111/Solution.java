package com.mlcr.tree.easy._111;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @author: fynch3r
 * @create: 2021-06-10 19:04
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

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }

        int min_Depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_Depth = Math.min(minDepth(root.left), min_Depth);
        }
        if (root.right != null) {
            min_Depth = Math.min(minDepth(root.right), min_Depth);
        }

        return min_Depth + 1;

    }

}
