package com.mlcr.number._414;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/third-maximum-number/
 * @author: fynch3r
 * @create: 2021-06-11 16:45
 **/


public class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num < second && num > third) {
                third = num;
            }
        }
        return third != Long.MIN_VALUE ? new Long(third).intValue() : new Long(first).intValue();
    }
}
