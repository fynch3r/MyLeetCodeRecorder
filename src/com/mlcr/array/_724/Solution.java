package com.mlcr.array._724;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/find-pivot-index/
 * @author: fynch3r
 * @create: 2021-07-14 16:20
 **/


public class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int len = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(2*sum+nums[i] == total){
                return i;
            }else{
                sum += nums[i];
            }
        }
        return -1;
    }
}
