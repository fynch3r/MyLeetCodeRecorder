package com.mlcr.easy._1534;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/count-good-triplets/
 * @author: fynch3r
 * @create: 2021-06-12 17:41
 **/


public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
