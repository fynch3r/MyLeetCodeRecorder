package com.mlcr.easy._1351;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * @author: fynch3r
 * @create: 2021-06-12 17:06
 **/


public class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) {
                    // 这一行剩余的个数
                    sum += grid[0].length - j;
                    break;
                }
            }

        }
        return sum;
    }
}
