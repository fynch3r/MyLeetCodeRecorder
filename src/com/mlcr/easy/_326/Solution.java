package com.mlcr.easy._326;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/power-of-three/
 * @author: 0range
 * @create: 2021-06-11 15:23
 **/


public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
