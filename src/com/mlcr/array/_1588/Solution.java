package com.mlcr.array._1588;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 * @author: fynch3r
 * @create: 2021-06-12 17:48
 **/


public class Solution {
    //    public int sumOddLengthSubarrays(int[] arr) {
//        int sum = 0;
//        // i大小,j末位,下标起始位
//        for (int i = 1; i <= arr.length; i += 2) {
//            for (int j = i; j <= arr.length; j++) {
//                for (int k = j - i; k < j; k++) {
//                    sum += arr[k];
//                }
//            }
//        }
//        return sum;
//    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        // i大小,j起始位,k是求和位置
        for (int i = 1; i <= arr.length; i += 2) {
            int gap = i;
            int count = 0;
            for (int j = 0; j + gap <= arr.length; j++) {
                int jump = j + gap;
                for (int k = j; k < jump && k < arr.length; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }

}
