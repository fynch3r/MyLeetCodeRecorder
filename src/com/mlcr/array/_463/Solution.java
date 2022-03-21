package com.mlcr.array._463;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/island-perimeter/
 * @author: fynch3r
 * @create: 2021-06-11 17:45
 **/


public class Solution {
    public int islandPerimeter(int[][] grid) {
        int land = 0;
        int border = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    //上下连
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        border++;
                    }
                    //左右连
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                        border++;
                    }
                }
            }
        }
        return 4 * land - 2 * border;
    }
}
