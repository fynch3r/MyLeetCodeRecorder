package com.mlcr.easy._1460;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * @author: 0range
 * @create: 2021-06-12 17:17
 **/


public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean flag = true;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i =0;i<target.length;i++){
            if(target[i] != arr[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
