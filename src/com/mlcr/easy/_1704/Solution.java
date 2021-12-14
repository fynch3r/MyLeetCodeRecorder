package com.mlcr.easy._1704;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/determine-if-string-halves-are-alike/
 * @author: 0range
 * @create: 2021-06-12 18:34
 **/


public class Solution {
    public boolean halvesAreAlike(String s) {
        boolean flag = true;
        char[] check = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String ss = new String(check);
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int count1 = 0, count2 = 0;
        for (char cr : s1.toCharArray()) {
            if (ss.indexOf(cr) != -1) {
                count1++;
            }
        }

        for (char cr : s2.toCharArray()) {
            if (ss.indexOf(cr) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }
}
