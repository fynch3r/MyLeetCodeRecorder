package com.mlcr.easy._349;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @author: fynch3r
 * @create: 2021-06-11 15:50
 **/


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        return getIntersection(set1, set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        Set<Integer> set3 = new HashSet<Integer>();

        //set1.size() < set2.size()
        for (int i : set1) {
            if (set2.contains(i)) {
                set3.add(i);
            }
        }

        int[] intersection = new int[set3.size()];
        int index = 0;
        for (int num : set3) {
            intersection[index++] = num;
        }
        return intersection;
    }
}
