package com.mlcr.string._125;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/valid-palindrome/
 * @author: fynch3r
 * @create: 2021-06-11 00:03
 **/


public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer stringTenet = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                stringTenet.append(Character.toLowerCase(ch));
            }
        }
        int start =0,end = stringTenet.length()-1;
        while(start < end) {
            if(stringTenet.charAt(start)!= stringTenet.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
