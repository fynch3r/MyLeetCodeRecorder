package com.mlcr.dp.easy._mst0801;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/three-steps-problem-lcci/ 三步上楼梯
 * @author: fynch3r
 * @create: 2022-03-22 21:20
 **/


public class Solution {
    public int waysToStep(int n) {
        if(n<=2){
            return n;
        }else if(n == 3){
            return 4;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4;i<dp.length;i++){
            dp[i] = ((dp[i-1] + dp[i-2])% 1000000007 + dp[i-3])% 1000000007;
        }
        return dp[n];
    }
}
