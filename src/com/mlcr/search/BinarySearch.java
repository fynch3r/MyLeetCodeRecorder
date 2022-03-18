package com.mlcr.search;

/**
 * @program: MyLeetCodeRecorder
 * @description: 有序数组的二分查找
 * @author: fynch3r
 * @create: 2022-03-18 10:11
 **/


public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                //todo
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;//相关返回值
    }
}
