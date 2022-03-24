package com.mlcr.dp.midium._120;

import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/triangle/ 三角形最小路径和
 * @author: fynch3r
 * @create: 2022-03-23 14:18
 **/


public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowCount = triangle.size();
        int[][] dp = new int[rowCount][rowCount];
        dp[0][0] = triangle.get(0).get(0);
        for(int i =1;i<rowCount;i++){
            //第i行有i+1个元素
            dp[i][0] = dp[i-1][0]+triangle.get(i).get(0);
            for(int j =1;j<i;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
            }
            dp[i][i] = dp[i-1][i-1]+triangle.get(i).get(i);
        }
        int minSum = dp[rowCount-1][0];
        for(int i = 1;i<rowCount;i++){
            minSum = Math.min(minSum,dp[rowCount-1][i]);
        }
        return minSum;
    }
}
