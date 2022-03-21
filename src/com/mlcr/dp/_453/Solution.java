package com.mlcr.dp._453;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * @author: fynch3r
 * @create: 2021-06-11 16:53
 **/


public class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        // 动态规划 每次都盯着前一个
        // moves 是前一个带给他的增量
        // diff 是他和前一个的差距
        // nums[i] 是加了增量之后的
        for (int i = 1; i < nums.length; i++) {
            int diff = (nums[i] + moves) - nums[i - 1];
            nums[i] += moves;
            moves += diff;
        }
        return moves;
    }
}
