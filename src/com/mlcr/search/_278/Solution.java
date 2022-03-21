package com.mlcr.search._278;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/first-bad-version/
 * @author: fynch3r
 * @create: 2021-06-11 14:52
 **/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version) {
        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
        return true;
    }
}
