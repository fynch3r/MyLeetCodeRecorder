package com.mlcr.dp.midium._63;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/unique-paths-ii/ 不同路径2
 * @author: fynch3r
 * @create: 2022-03-23 11:38
 **/


public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowCount = obstacleGrid.length;
        int columnCount = obstacleGrid[0].length;
        int[][] dp = new int[rowCount][columnCount];
        if(obstacleGrid[0][0] == 0){
            dp[0][0] = 1;
        }else{
            dp[0][0] = 0;
        }

        // 初始化，又障碍物的位置后面都没法走到了
        for(int i = 0;i<columnCount;i++){
            if(obstacleGrid[0][i] == 1){
                break;
            }
            dp[0][i] = 1;
        }
        for(int j =0;j<rowCount;j++){
            if(obstacleGrid[j][0] == 1){
                break;
            }
            dp[j][0] = 1;
        }

        for(int i =1;i<rowCount;i++){
            for(int j = 1;j<columnCount;j++){
                //当前位置不是障碍物，才参与路径计算
                if(obstacleGrid[i][j] ==0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[rowCount-1][columnCount-1];
    }
}
