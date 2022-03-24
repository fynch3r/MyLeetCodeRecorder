package com.mlcr.dp.easy._053;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-subarray/
 * @author: fynch3r
 * @create: 2021-06-10 15:54
 **/


public class Solution {
    public static int maxSumPro(int[] nums){
        int length = nums.length;
        int[] dp = new int[length];
        int start = 0;
        int end = 0;
        dp[0] = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(nums[i]>dp[i-1]+nums[i]){ //new start
                start = i;
            }
            if(maxSum<dp[i]){
                end = i;
            }
            maxSum = Math.max(dp[i],maxSum);
        }
        System.out.println(nums[start]+"->"+nums[end]);
        int[] newArray = Arrays.copyOfRange(nums, start, end+1);
        System.out.println(Arrays.toString(newArray));
        return maxSum;
    }
}
