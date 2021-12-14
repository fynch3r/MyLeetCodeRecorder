package com.mlcr.easy._1281;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * @author: 0range
 **/


public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int num = n % 10;
            sum += num;
            product *= n;
            n /= 10;
        }
        return product - sum;
    }
}
