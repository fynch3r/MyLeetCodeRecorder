package com.mlcr.easy._500;

import java.util.ArrayList;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/keyboard-row/
 * @author: fynch3r
 * @create: 2021-06-12 11:36
 **/


public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<String>(words.length);
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            char[] temp = words[i].toUpperCase().toCharArray();
            char firstChar = words[i].charAt(0);
            int line = getLine(firstChar);
            for (char c : temp) {
                //找到对应的数组,

                if (getLine(c) != line) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(words[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public int getLine(char c) {
        String first = "QWERTYUIOP";
        String second = "ASDFGHJKL";
        String third = "ZXCVBNM";
        char ch = Character.toUpperCase(c);
        if (first.indexOf(ch) != -1) {
            return 1;
        } else if (second.indexOf(ch) != -1) {
            return 2;
        } else {
            return 3;
        }
    }

}
