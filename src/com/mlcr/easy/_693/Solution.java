package com.mlcr.easy._693;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 * @author: fynch3r
 * @create: 2021-07-13 16:48
 **/


public class Solution {
    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int pop = n % 2;
            n /= 2;
            if (pop == n % 2) {
                return false;
            }
        }
        return true;
    }
}
