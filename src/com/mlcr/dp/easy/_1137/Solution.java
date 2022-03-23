package com.mlcr.dp.easy._1137;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/n-th-tribonacci-number/ 第 N 个泰波那契数
 * @author: fynch3r
 * @create: 2022-03-22 17:13
 **/


public class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;
        answer[2] = 1;
        for (int i = 3; i <= n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2] + answer[i - 3];
        }
        return answer[n];
    }
}
