package com.mlcr.array._496;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/next-greater-element-i/
 * @author: fynch3r
 * @create: 2021-06-12 11:26
 **/


public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Arrays.fill(result, -1);

        for (int i = 0; i < nums1.length; i++) {
            int index = 0;
            // 记录相等值的下标
            for (int k = 0; k < nums2.length; k++) {
                if (nums2[k] == nums1[i]) {
                    index = k;
                }
            }
            // 开始寻找
            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}
