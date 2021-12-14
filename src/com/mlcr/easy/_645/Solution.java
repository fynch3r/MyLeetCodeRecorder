package com.mlcr.easy._645;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/set-mismatch/
 * @author: 0range
 * @create: 2021-06-12 15:23
 **/


public class Solution {
    public int[] findErrorNums(int[] nums) {
        /**
         思路：创建一个备用空间arr
         在nums里面出现过的数字就放在arr[nums]位置 为1
         如果已经为1了 说明出现过
         由于数组起始值为1 从1遍历arr 如果某一位为0 说明没出现过 将下表返回
         */
        int len = nums.length;
        int[] res = new int[2];
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            if (arr[num] != 0) {
                res[0] = num;
            }
            arr[num] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
