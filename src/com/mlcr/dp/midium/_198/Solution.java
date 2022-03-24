package com.mlcr.dp.midium._198;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/house-robber/ 打家劫舍
 * @author: fynch3r
 * @create: 2022-03-23 14:37
 **/


public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }else if(len ==1){
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for(int i = 2;i<len;i++){
            int temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }
}
