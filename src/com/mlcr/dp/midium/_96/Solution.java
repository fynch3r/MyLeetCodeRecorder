package com.mlcr.dp.midium._96;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/unique-binary-search-trees/ 不同的二叉搜索树
 * @author: fynch3r
 * @create: 2022-03-23 13:33
 **/


public class Solution {
    public int numTrees(int n) {
        // dp[i] = Sum(dp[i-1]*dp[n-i])
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<dp.length;i++){
            for(int j = 1;j<=i;j++){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
