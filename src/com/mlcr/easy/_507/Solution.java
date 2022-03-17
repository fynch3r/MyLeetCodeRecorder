package com.mlcr.easy._507;

import java.util.ArrayList;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/perfect-number/
 * @author: fynch3r
 * @create: 2021-06-12 13:20
 **/


public class Solution {
    public boolean checkPerfectNumber(int num) {
        /**
         思路：平方根为分界，最后结果的和为2倍的num
         */

        ArrayList<Integer> res = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i < num) {
                    sum += num / i;
                }
            }
        }

        return sum == 2 * num;

    }
}
