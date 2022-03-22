package com.mlcr.number._1342;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * @author: fynch3r
 * @create: 2021-06-12 17:05
 **/


public class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }
}
