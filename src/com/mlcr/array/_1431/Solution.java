package com.mlcr.array._1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * @author: fynch3r
 * @create: 2021-06-12 17:10
 **/


public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = candies[0];
        for(int i =0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        for(int can:candies){
            int gap = max-can;
            if(gap<=extraCandies){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }
        return answer;
    }
}
