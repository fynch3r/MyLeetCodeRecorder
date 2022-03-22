package com.mlcr.hashtable._771;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/jewels-and-stones/ 宝石与石头
 * @author: fynch3r
 * @create: 2021-06-12 15:38
 **/

// 哈希表
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();
        for(int i =0;i<J.length();i++){
            jewelSet.add(J.charAt(i));
        }
        for(int j =0;j<S.length();j++){
            if(jewelSet.contains(S.charAt(j))){
                count++;
            }
        }
        return count;
    }
}
