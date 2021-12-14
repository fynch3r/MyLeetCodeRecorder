package com.mlcr.easy._1470;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/shuffle-the-array/
 * @author: 0range
 * @create: 2021-06-12 17:21
 **/


public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ret[i * 2] = nums[i];
            ret[i * 2 + 1] = nums[n + i];
        }
        return ret;
    }
}
