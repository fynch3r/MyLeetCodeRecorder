package com.mlcr.number._069;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/sqrtx/
 * @author: fynch3r
 * @create: 2021-06-10 16:34
 **/


public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x / mid >= mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right - 1;
    }
}
