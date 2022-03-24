package com.mlcr.tree.easy._257;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-tree-paths/ 二叉树的所有路径
 * @author: fynch3r
 * @create: 2021-07-09 14:56
 **/


public class Solution {
    class TreeNode {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        finder(answer,"",root);
        return answer;
    }
    public void finder(List<String> answer,String path,TreeNode root) {
        StringBuilder sb = new StringBuilder(path);
        sb.append(root.val);
        if(root.left ==null && root.right == null){
            //叶子节点就是终点，添加到结果集合中
            answer.add(sb.toString());
        } else{
            sb.append("->");
            finder(answer,sb.toString(),root.left);
            finder(answer,sb.toString(),root.right);
        }
    }
}
