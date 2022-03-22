package com.mlcr.array._1365;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * @author: fynch3r
 * @create: 2021-06-12 17:07
 **/


public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] target = new int[len];

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            target[i] = count;
        }

        return target;
    }
}
