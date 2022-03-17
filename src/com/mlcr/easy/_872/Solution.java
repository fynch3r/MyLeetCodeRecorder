package com.mlcr.easy._872;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/leaf-similar-trees/
 * @author: fynch3r
 * @create: 2021-07-14 17:15
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


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        if (root1 != null) {
            iteration(root1, list1);
        }
        if (root2 != null) {
            iteration(root2, list2);
        }
        return list1.equals(list2);
    }

    private void iteration(TreeNode node, List<Integer> list) {
        // 叶子节点
        if (node.left == null && node.right == null) {
            list.add(node.val);
        } else {
            if (node.left != null) {
                iteration(node.left, list);
            }
            if (node.right != null) {
                iteration(node.right, list);
            }
        }
    }


}
