package com.mlcr.hashtable._884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/  两句话中的不常见单词
 * @author: fynch3r
 * @create: 2021-07-14 19:36
 **/


public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String word : s1.split(" ")) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (String word : s2.split(" ")) {
            map.put(word,map.getOrDefault(word,0)+1);
        }

        List<String> list = new ArrayList<String>();
        for (String s : map.keySet()) {
            if(map.get(s)==1){
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
