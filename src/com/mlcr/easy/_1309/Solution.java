package com.mlcr.easy._1309;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * @author: 0range
 * @create: 2021-06-12 16:42
 **/


public class Solution {
    public String freqAlphabets(String s) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append(alphabet[Integer.parseInt(s.substring(i, i + 2)) - 1]);
                i += 3;
            } else {
                sb.append(alphabet[Character.getNumericValue(s.charAt(i)) - 1]);
                i++;
            }
        }
        return sb.toString();
    }
}
