package com.mlcr.easy._171;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/excel-sheet-column-number/
 * @author: fynch3r
 * @create: 2021-06-11 11:39
 **/


public class Solution {
    public static int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            int num = (charArray[i] - 'A' + 1) * (int) Math.pow(26, length - i - 1);
            result += num;
        }
        return result;
    }
}
