package com.mlcr.easy._1304;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 * @author: 0range
 * @create: 2021-06-12 16:37
 **/


public class Solution {

    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n / 2; i++) {
            arr[i] = i;
            arr[n - 1 - i] = -arr[i];
        }
        return arr;
    }
}
