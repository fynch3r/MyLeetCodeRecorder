package com.mlcr.subsequence._594;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-harmonious-subsequence/ 最长和谐子序列
 * @author: fynch3r
 * @create: 2021-06-12 14:19
 **/


public class Solution {
    public int findLHS(int[] nums) {
        //哈希表
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxLen = 0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                maxLen = Math.max(maxLen,map.get(key)+map.get(key+1));
            }
        }
        return maxLen;
    }
}
