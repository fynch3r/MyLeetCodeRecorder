package com.mlcr.array._485;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/max-consecutive-ones/
 * @author: fynch3r
 * @create: 2021-06-12 11:16
 **/


public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0;
        int count = 0;

        for(int i = 0; i < len; i++) {
            if(nums[i] == 1){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                //归零，重新开始
                count = 0;
            }
        }

        //最后一次超出范围了，但还是需要比较的
        return Math.max(max, count);



    }
}
