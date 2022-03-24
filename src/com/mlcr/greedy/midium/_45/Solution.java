package com.mlcr.greedy.midium._45;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/jump-game-ii/ 跳跃游戏2
 * @author: fynch3r
 * @create: 2022-03-23 21:07
 **/


public class Solution {
    public int jump(int[] nums){
        int len = nums.length;
        int rightMax = 0;
        int board = 0;
        int steps = 0;
        for(int i =0;i<len-1;i++){
            rightMax = Math.max(rightMax,i+nums[i]);
            if(i == board){
                board = rightMax;//end初始值就是nums[0]的极限位置
                steps++;
            }
        }
        return steps;
    }
}
