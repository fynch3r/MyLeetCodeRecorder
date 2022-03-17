package com.mlcr.easy._235;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * @author: fynch3r
 * @create: 2021-07-09 14:46
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
}
