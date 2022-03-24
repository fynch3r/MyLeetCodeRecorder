package com.mlcr.tree.easy._108;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * @author: fynch3r
 * @create: 2021-06-10 18:38
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);//递归建树
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点，这里选择的策略不同，建立的树就不同
        int mid = (left + right) / 2;
        //二叉搜索树的中序遍历是升序的
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }


}
