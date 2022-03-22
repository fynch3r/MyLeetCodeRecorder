package com.mlcr.easy._00;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: fynch3r
 * @create: 2022-03-22 09:53
 **/


public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,3,2};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        int max = 0;
        for (int key : map.keySet()) {
            if(map.containsKey(key+1)){
                max = Math.max(map.get(key)+map.get(key+1),max);
            }
        }


    }
}
