package com.mlcr.easy._257;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-tree-paths/
 * @author: 0range
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
        finder(answer, "", root);
        return answer;
    }

    private void finder(List<String> answer, String path, TreeNode root) {
        if (root != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.val);
            //叶子节点
            if (root.left == null && root.right == null) {
                answer.add(sb.toString()); // 把路径加入答案中
            } else {
                sb.append("->");
                finder(answer, sb.toString(), root.left);
                finder(answer, sb.toString(), root.right);
            }
        }
    }
}
