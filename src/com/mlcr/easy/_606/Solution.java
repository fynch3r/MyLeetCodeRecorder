package com.mlcr.easy._606;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * @author: 0range
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
        if(t == null){
            return "";
        }else if(t.left == null && t.right== null){// 叶子结点
            return t.val + "";
        }else if(t.right == null){ // 只有左子树
            return t.val + "(" + tree2str(t.left)+")";
        }else{
            return t.val + "("+tree2str(t.left)+")(" + tree2str(t.right)+")";
        }
    }

}