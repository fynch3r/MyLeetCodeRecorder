package com.mlcr.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: 0range
 * @create: 2021-06-14 16:15
 **/


public class inOrder {
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

    // 递归
    public List<Integer> inOrderRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    public void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    // 迭代
    public List<Integer> inOrderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                //压栈
                stack.push(root);
                //循环找左子树
                root = root.left;
            }
            //左子树压到头 弹栈
            if (!stack.isEmpty()) {
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }
}
