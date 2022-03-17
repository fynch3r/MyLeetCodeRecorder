package com.mlcr.easy._172;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * @author: fynch3r
 * @create: 2021-06-11 13:05
 **/


public class Solution {
    public static int trailingZeroes(int n) {
        // 有一个5倍数就有一个0,5*n还会自己带一个，需要循环去找
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
