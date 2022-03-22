package com.mlcr.slidingwindow._643;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-average-subarray-i/ 子数组最大平均数 I
 * @author: fynch3r
 * @create: 2021-06-12 15:20
 **/


public class Solution {
    /**
     * 思路: 滑动窗口
     */
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < len; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }
        return 1.0 * max / k;

    }
}
