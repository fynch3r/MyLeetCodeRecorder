package com.mlcr.easy._1678;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/goal-parser-interpretation/
 * @author: fynch3r
 * @create: 2021-06-12 18:30
 **/


public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] cc = command.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if (cc[i] == 'G') {
                sb.append(cc[i]);
            }
            if (cc[i] == '(' && cc[i + 1] == ')') {
                sb.append("o");
            } else if (cc[i] == '(' && cc[i + 3] == ')') {
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
