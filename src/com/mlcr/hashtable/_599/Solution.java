package com.mlcr.hashtable._599;

import java.util.*;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * @author: fynch3r
 * @create: 2021-06-12 14:41
 **/


public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i =0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        List<String> result = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for(int i = 0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int j = map.get(list2[i]);
                if(i+j<sum){
                    result.clear();
                    result.add(list2[i]);
                    sum = i+j;
                }else if(i+j==sum){//多个答案
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);

    }
}
