package com.mlcr.string._205;

import java.util.HashMap;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/isomorphic-strings/
 * @author: fynch3r
 * @create: 2021-06-11 13:57
 **/


public class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }

        return true;
    }
}
