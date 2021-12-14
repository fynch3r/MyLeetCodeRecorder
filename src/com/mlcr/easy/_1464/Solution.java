package com.mlcr.easy._1464;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 * @author: 0range
 * @create: 2021-06-12 17:18
 **/


public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 1] - 1) * (nums[len - 2] - 1);
    }
}
