package com.mlcr.dp.midium._55;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/jump-game/ 跳跃游戏
 * @author: fynch3r
 * @create: 2022-03-23 20:36
 **/


public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightMax = 0;
        for(int i =0;i<len;i++){
            if(i<=rightMax){
                rightMax = Math.max(nums[i]+i,rightMax);
                if(rightMax >= len-1){
                    return true;
                }
            }
        }
        return false;
    }
}
