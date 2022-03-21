package com.mlcr.number._258;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/add-digits/
 * @author: fynch3r
 * @create: 2021-06-11 14:36
 **/


public class Solution {
    public int addDigits(int num) {
        if (num <= 10) {
            return num;
        }
        int temp = 0;
        while (num != 0) {
            temp = temp + num % 10;
            num = num / 10;
        }
        return addDigits(temp);
    }
}
