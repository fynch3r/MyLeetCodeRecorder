package com.mlcr.easy._504;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/base-7/
 * @author: fynch3r
 * @create: 2021-06-12 11:37
 **/


public class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        if (num == 0) {
            return sb.append(0).toString();
        }
        if (num < 0) {
            num = -num;
            flag = true;
        }
        while (num != 0) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        // 负数需要加负号
        if (flag) {
            sb.insert(0, "-");
        }

        return sb.toString();
    }
}
