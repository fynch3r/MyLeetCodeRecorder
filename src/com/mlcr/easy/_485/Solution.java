package com.mlcr.easy._485;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/max-consecutive-ones/
 * @author: fynch3r
 * @create: 2021-06-12 11:16
 **/


public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int left = 0,right = 0;


        // 双指针
        while(right < len){

            if(nums[right] == 1){
                right++;
                continue;
            }

            count = Math.max(count,right - left);

            while(right  < len && nums[right] == 0){
                right++;
            }

            //重新出发
            left = right;
        }

        return Math.max(count,right-left);
    }
}
