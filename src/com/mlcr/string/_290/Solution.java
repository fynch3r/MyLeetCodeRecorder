package com.mlcr.string._290;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/word-pattern/
 * @author: fynch3r
 * @create: 2021-06-11 15:10
 **/


public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        // 如果二者长度都不等，那么根本无法匹配 直接返回false
        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            // 如果map里面不含第一个特征key
            if (!map.containsKey(pattern.charAt(i))) {
                // 但是已经含了第一个值
                if (map.containsValue(arr[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), arr[i]);
            } else {
                // 如果含第一个key
                // 但是第一个key对应的value不是正常模式的一个value
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
