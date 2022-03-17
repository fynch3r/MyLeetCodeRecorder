package com.mlcr.medium._011;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/container-with-most-water/
 * @author: fynch3r
 * @create: 2021-06-12 18:56
 **/


public class Solution {
    // 双指针
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int result = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            result = Math.max(result, area);
            // 移动位置
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
