package com.mlcr.dp._1480;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * @author: fynch3r
 * @create: 2021-06-12 17:25
 **/


public class Solution {
    public int[] runningSum(int[] nums) {
        int[] data = new int[nums.length];
        data[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            data[i] = data[i-1]+nums[i];
        }
        return data;
    }
}
