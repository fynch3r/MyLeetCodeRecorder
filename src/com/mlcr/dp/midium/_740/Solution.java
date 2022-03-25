package com.mlcr.dp.midium._740;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/delete-and-earn/ 删除并获得点数
 * @author: fynch3r
 * @create: 2022-03-25 11:20
 **/


public class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        //选出当前数组中最大的数字
        for(int num:nums){
            maxVal = Math.max(maxVal,num);
        }
        int[] sum = new int[maxVal+1];
        for(int val:nums){
            sum[val] += val;
        }
        return rob(sum);
    }

    public int rob(int[] nums){
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            int temp = second;
            second = Math.max(first+nums[i],second);
            first = temp;
        }
        return second;
    }
}
