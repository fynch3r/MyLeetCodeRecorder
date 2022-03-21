package com.mlcr.tree._637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/ 二叉树每层平均值
 * @author: fynch3r
 * @create: 2021-07-12 15:39
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

    List<Double> answerArray = new ArrayList<>();

    // BFS 队列实现
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode headNode = queue.poll();
                sum += headNode.val;
                if(headNode.left!=null){
                    queue.add(headNode.left);
                }
                if(headNode.right != null){
                    queue.add(headNode.right);
                }
            }
            averageList.add(sum/size);
        }
        return averageList;
    }
}
