package com.mlcr.easy._226;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: fynch3r
 * @create: 2021-07-09 14:09
 **/


public class Solution {
    class TreeNode {
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

    public TreeNode invert(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.right = left;
        root.left = right;
        return root;
    }
}
