package com.mlcr.easy._1252;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 * @author: 0range
 * @create: 2021-06-12 16:09
 **/


public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int sum = 0;
        int rowNum = 0;
        for (int row : rows) {
            if (row % 2 == 1) {
                sum += m;
                rowNum++;
            }
        }
        for (int col : cols) {
            if (col % 2 == 1) {
                sum += n - 2 * rowNum;
            }
        }
        return sum;
    }
}
