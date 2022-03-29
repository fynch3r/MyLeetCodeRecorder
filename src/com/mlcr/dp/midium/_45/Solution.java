package com.mlcr.dp.midium._45;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/jump-game-ii/ 跳跃游戏2
 * @author: fynch3r
 * @create: 2022-03-26 16:38
 **/


public class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int rightMax = 0;
        int board = 0; // 边界
        int step = 0;
        for(int i = 0; i < len-1; i++) {
            rightMax  = Math.max(i+nums[i],rightMax);
            if(i == board){//当前边界到头了
                board = rightMax; // 更新边界，下一个边界是rightMax
                step++;
            }
        }
        return step;

    }
}
