package com.mlcr.twopointer._026;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @author: fynch3r
 * @create: 2021-06-10 15:51
 **/

/**
 * 同向双指针
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int slow = 0;
        for(int fast = 1;fast<nums.length;fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
