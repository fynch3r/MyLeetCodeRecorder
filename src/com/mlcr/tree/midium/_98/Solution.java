package com.mlcr.tree.midium._98;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/validate-binary-search-tree/ 验证二叉搜索树
 * @author: fynch3r
 * @create: 2022-03-24 19:08
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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        } else if (node.val <= minVal || node.val >= maxVal) {
            return false;
        }
        return isValidBST(node.left, minVal, node.val) && isValidBST(node.right, node.val, maxVal);
    }
}
