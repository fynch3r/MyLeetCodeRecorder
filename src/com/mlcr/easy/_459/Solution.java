package com.mlcr.easy._459;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/repeated-substring-pattern/
 * @author: fynch3r
 * @create: 2021-06-11 17:32
 **/


public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
