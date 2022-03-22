package com.mlcr.array._1572;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/matrix-diagonal-sum/
 * @author: fynch3r
 * @create: 2021-06-12 17:46
 **/


public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length, mid = n / 2;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum += (mat[i][i] + mat[i][j]);
        }
        return n % 2 == 0 ? sum : sum - mat[mid][mid];
    }
}
