package com.mlcr.dp.midium._337;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/house-robber-iii/
 * @author: fynch3r
 * @create: 2022-03-23 19:52
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

    public int rob(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0], rootStatus[1]);
    }

    public int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] l = dfs(node.left);
        int[] r = dfs(node.right);
        int selectNode = node.val + l[1] + r[1];
        int notSelectNode = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        return new int[]{selectNode, notSelectNode};
    }


}
