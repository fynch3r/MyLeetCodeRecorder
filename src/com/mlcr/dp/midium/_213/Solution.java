package com.mlcr.dp.midium._213;

import com.sun.tools.javadoc.Start;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/house-robber-ii/ 打家劫舍2 成环
 * @author: fynch3r
 * @create: 2022-03-23 16:05
 **/


public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }else if(length == 2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(robRanges(nums, 0,length-2),robRanges(nums, 1,length-1));
    }

    public int robRanges(int[] nums,int start,int end) {
        int first = nums[start];
        int second = Math.max(nums[start],nums[start+1]);
        for(int i = start+2;i<=end;i++){
            int temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }
}
