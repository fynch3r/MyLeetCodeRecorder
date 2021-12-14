package com.mlcr.medium._102;

import java.util.*;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @author: 0range
 * @create: 2021-06-12 19:14
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                // 出队列
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    // 左节点加入队列
                    queue.add(node.left);
                }
                if (node.right != null) {
                    // 右节点加入队列
                    queue.add(node.right);
                }
            }
            result.add(level);
        }

        return result;

    }

}

