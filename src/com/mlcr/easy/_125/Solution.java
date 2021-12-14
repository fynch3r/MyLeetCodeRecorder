package com.mlcr.easy._125;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/valid-palindrome/
 * @author: 0range
 * @create: 2021-06-11 00:03
 **/


public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer stringTenet = new StringBuffer();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringTenet.append(Character.toLowerCase(c));
            }
        }

        int length = stringTenet.length();
        int left = 0, right = length - 1;
        while (left < right) {
            if (stringTenet.charAt(left) != stringTenet.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
