package com.mlcr.array._088;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/merge-sorted-array/
 * @author: fynch3r
 * @create: 2021-06-10 16:55
 **/


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //System.arraycopy(nums2, 0, nums1, m, n);
        //Arrays.sort(nums1);

        int[] answer = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                answer[k++] = nums1[i++];
            } else {
                answer[k++] = nums2[j++];
            }
        }
        while (i < m) {
            answer[k++] = nums1[i++];
        }
        while (j < n) {
            answer[k++] = nums2[j++];
        }
        for (int p = 0; p < m + n; p++) {
            nums1[p] = answer[p];
        }

    }
}
