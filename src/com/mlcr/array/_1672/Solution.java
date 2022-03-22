package com.mlcr.array._1672;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/richest-customer-wealth/
 * @author: fynch3r
 * @create: 2021-06-12 18:23
 **/


public class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;

        int max = 0;
        int temp = 0;
        for (int account : accounts[0]) {
            max += account;
        }
        for (int j = 1; j < accounts.length; j++) {
            for (int account : accounts[j]) {
                temp += account;
            }
            if (max < temp) {
                max = temp;
            }
            temp = 0;
        }

        return max;
    }
}
