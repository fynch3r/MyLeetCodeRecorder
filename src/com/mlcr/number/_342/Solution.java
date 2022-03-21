package com.mlcr.number._342;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/power-of-four/
 * @author: fynch3r
 * @create: 2021-06-11 15:28
 **/


public class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        // n==1
        return true;
    }
}
