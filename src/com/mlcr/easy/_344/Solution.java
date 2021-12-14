package com.mlcr.easy._344;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-string/
 * @author: 0range
 * @create: 2021-06-11 15:30
 **/


public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
