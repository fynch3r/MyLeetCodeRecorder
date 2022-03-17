package com.mlcr.easy._242;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/valid-anagram/
 * @author: fynch3r
 * @create: 2021-06-11 14:23
 **/


public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
