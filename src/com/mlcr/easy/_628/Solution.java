package com.mlcr.easy._628;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * @author: 0range
 * @create: 2021-06-12 15:01
 **/


public class Solution {
    public int maximumProduct(int[] nums) {
        /**
         思路：排序 三个最大正数/两个最小负数+一个最大正数
         */
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(
                nums[len - 1] * nums[len - 2] * nums[len - 3],
                nums[0] * nums[1] * nums[len - 1]
        );
    }
}
