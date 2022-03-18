package com.mlcr.search._035;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/search-insert-position/
 * @author: fynch3r
 * @create: 2021-06-10 15:54
 **/


public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
}
