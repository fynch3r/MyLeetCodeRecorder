package com.mlcr.dp._509;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/fibonacci-number/
 * @author: fynch3r
 * @create: 2021-06-12 13:22
 **/


public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
