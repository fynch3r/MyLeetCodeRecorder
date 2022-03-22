package com.mlcr.hashtable._645;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/set-mismatch/
 * @author: fynch3r
 * @create: 2021-06-12 15:23
 **/


public class Solution {
    public int[] findErrorNums(int[] nums) {
        /**
         思路：哈希表
         */
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i =1;i<nums.length;i++){
            int count = map.getOrDefault(i,0);
            if(count ==2){
                result[0] = i;
            }else if(count == 0){
                result[1] =  i;
            }
        }
        return result;
    }
}
