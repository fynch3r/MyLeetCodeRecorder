package com.mlcr.array._1646;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/get-maximum-in-generated-array/ 获取生成数组中的最大值
 * @author: fynch3r
 * @create: 2022-03-22 19:25
 **/


public class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] =0;
        dp[1] =1;
        int max = Integer.MIN_VALUE;
        for(int i=2;i<dp.length;i++){
            if(i%2 ==0){
                dp[i] = dp[i/2];
            }else{
                dp[i] = dp[i/2]+dp[i/2+1];
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
