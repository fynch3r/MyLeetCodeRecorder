package com.mlcr.easy._541;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reverse-string-ii/
 * @author: fynch3r
 * @create: 2021-06-12 14:07
 **/


public class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += k * 2) {
            int start = i;
            int end = Math.min(i + k - 1, a.length - 1);
            while (start < end) {
                char tmp = a[start];
                a[start++] = a[end];
                a[end--] = tmp;
            }
        }
        return new String(a);
    }
}
