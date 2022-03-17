package com.mlcr.easy._167;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * @author: fynch3r
 * @create: 2021-06-11 10:35
 **/


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
