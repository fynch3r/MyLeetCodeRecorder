package com.mlcr.tree._606;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/construct-string-from-binary-tree/ 根据二叉树创建字符串
 * @author: fynch3r
 * @create: 2021-07-12 15:17
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

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        } else if (t.left == null && t.right == null) {//叶子节点
            return t.val + "";
        } else if (t.right == null) {// 只有左子树
            return t.val + "(" + tree2str(t.left) + ")";
        } else {//左右都有
            return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
        }
    }

}
