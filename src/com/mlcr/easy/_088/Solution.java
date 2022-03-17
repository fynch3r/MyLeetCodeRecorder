package com.mlcr.easy._088;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/merge-sorted-array/
 * @author: fynch3r
 * @create: 2021-06-10 16:55
 **/


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
