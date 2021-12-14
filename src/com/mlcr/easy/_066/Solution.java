package com.mlcr.easy._066;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/plus-one/
 * @author: 0range
 * @create: 2021-06-10 16:14
 **/


public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        //需要增位：9->10
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
