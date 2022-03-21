package com.mlcr.array._169;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/majority-element/
 * @author: fynch3r
 * @create: 2021-06-11 11:37
 **/


public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
