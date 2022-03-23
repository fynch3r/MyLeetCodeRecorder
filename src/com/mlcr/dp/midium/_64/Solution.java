package com.mlcr.dp.midium._64;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-path-sum/ 最小路径和
 * @author: fynch3r
 * @create: 2022-03-23 11:06
 **/


public class Solution {
    public int minPathSum(int[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;
        if(grid == null || rowCount == 0 || columnCount == 0){
            return 0;
        }
        int[][] dp = new int[rowCount][columnCount];
        dp[0][0] = grid[0][0];
        //行初始化
        for(int i =1;i<columnCount;i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        //列初始化
        for(int j = 1;j<rowCount;j++){
            dp[j][0] = dp[j-1][0] + grid[j][0];
        }

        for(int i=1;i<rowCount;i++){
            for(int j = 1;j<columnCount;j++){
                dp[i][j] = Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
            }
        }
        return dp[rowCount-1][columnCount-1];
    }
}
