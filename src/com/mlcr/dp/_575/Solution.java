package com.mlcr.dp._575;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/distribute-candies/ 分糖果
 * @author: fynch3r
 * @create: 2021-06-12 14:13
 **/


public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
