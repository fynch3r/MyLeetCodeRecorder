package com.mlcr.easy._671;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/
 * @author: 0range
 * @create: 2021-07-12 16:44
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


    // 先遍历再排序
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }


}
