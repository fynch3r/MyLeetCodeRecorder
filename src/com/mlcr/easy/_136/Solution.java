package com.mlcr.easy._136;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/single-number/
 * @author: 0range
 * @create: 2021-06-11 09:37
 **/


public class Solution {
    public int singleNumber(int[] nums) {
        //异或具有追踪性
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
