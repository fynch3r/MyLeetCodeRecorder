package com.mlcr.easy._101;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/symmetric-tree/
 * @author: fynch3r
 * @create: 2021-06-10 17:29
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

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            //到头了
            return true;
        }
        if (p == null || q == null) {
            //有人缺项
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }



}
