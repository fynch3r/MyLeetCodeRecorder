package com.mlcr.number._168;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/excel-sheet-column-title/
 * @author: fynch3r
 * @create: 2021-06-11 11:11
 **/


public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % 26;
            if (mod == 0) {
                mod = 26;
                n--;
            }
            sb.insert(0, (char) ('A' + mod - 1));
            n /= 26;
        }
        return sb.toString();
    }
}
