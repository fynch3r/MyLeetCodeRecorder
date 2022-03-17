package com.mlcr.tree;

import java.util.*;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: 0range
 * @create: 2021-06-14 16:26
 **/


public class postOrder {
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
    public List<Integer> postOrderRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    public void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    // 迭代
    public List<Integer> postOrderIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastVisit = root;

        if (root == null) {
            return result;
        }

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // 查看栈顶元素
            root = stack.peek();

            //如果该元素没有右子树 或者 右子树访问过
            // 直接弹栈，输出当前的值
            if (root.right == null || root.right == lastVisit) {
                stack.pop();
                result.add(root.val);
                // 重置lastVisit
                lastVisit = root;
                root = null;
            } else {
                root = root.right;
            }

        }
        return result;
    }

    // 小trick
    // 前序遍历顺序根左右，压栈顺序是根右左
    // 后序遍历顺序左右根，反过来就是根右左，可以让压栈顺序为根左右,最后再颠倒就可以了
    public List<Integer> postOrderTrick(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
