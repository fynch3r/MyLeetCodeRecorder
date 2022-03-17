package com.mlcr.easy._561;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/array-partition-i/
 * @author: fynch3r
 * @create: 2021-06-12 14:12
 **/


public class Solution {
    public int arrayPairSum(int[] nums) {
        //最小的总和最大
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
