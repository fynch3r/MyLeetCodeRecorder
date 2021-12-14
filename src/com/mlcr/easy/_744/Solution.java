package com.mlcr.easy._744;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * @author: 0range
 * @create: 2021-07-13 17:23
 **/


public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char answer = ' ';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                answer = letters[i];
                break;
            }
        }
        if (answer == ' ') {
            answer = letters[0];
        }
        return answer;
    }
}
