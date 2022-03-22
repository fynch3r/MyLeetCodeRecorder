package com.mlcr.subsequence._674;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/ 最长连续递增序列
 * @author: fynch3r
 * @create: 2021-07-13 16:29
 **/

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <=1){
            return nums.length;
        }
        int count = 1;
        int max = 1;
        for(int i =1;i<nums.length;i++) {
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
