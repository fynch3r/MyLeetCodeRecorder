package com.mlcr.array._766;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/toeplitz-matrix/
 * @author: fynch3r
 * @create: 2021-07-13 17:33
 **/


public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;//行数
        int n = matrix[0].length;//列数
        // 每个数字和他自己左上角的数字相比
        //[1][1]是起点
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
