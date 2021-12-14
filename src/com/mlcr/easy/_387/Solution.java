package com.mlcr.easy._387;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @author: 0range
 * @create: 2021-06-11 16:11
 **/


public class Solution {
    public int firstUniqChar(String s) {
        // <字符，次数>
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1) {
                return i;
            }
        }
        return -1;

    }
}
