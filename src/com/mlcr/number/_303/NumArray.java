package com.mlcr.number._303;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/range-sum-query-immutable/
 * @author: fynch3r
 * @create: 2021-07-09 15:18
 **/


public class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }

}
