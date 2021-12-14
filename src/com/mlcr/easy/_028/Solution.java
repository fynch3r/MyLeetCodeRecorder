package com.mlcr.easy._028;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/implement-strstr/
 * @author: 0range
 * @create: 2021-06-10 15:53
 **/


public class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i < h - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
