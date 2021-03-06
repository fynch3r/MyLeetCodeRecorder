package com.mlcr.array._867;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/transpose-matrix/ 转置矩阵
 * @author: fynch3r
 * @create: 2021-07-14 16:53
 **/


public class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
