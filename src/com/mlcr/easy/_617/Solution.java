package com.mlcr.easy._617;

import javax.swing.tree.TreeNode;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @author: 0range
 * @create: 2021-07-12 15:31
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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }
        TreeNode mergedTree = new TreeNode(root1.val + root2.val);
        mergedTree.left = mergeTrees(root1.left, root2.left);
        mergedTree.right = mergeTrees(root1.right, root2.right);
        return mergedTree;
    }


}
