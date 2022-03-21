package com.mlcr.number._231;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/power-of-two/
 * @author: fynch3r
 * @create: 2021-06-11 14:18
 **/


public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        //排除偶数但不是2幂
        return n == 1;
    }
}
