package com.mlcr.easy._1431;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * @author: 0range
 * @create: 2021-06-12 17:10
 **/


public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 算出来那个孩子的糖果最多
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> check = new ArrayList<>(candies.length);


        for (int candy : candies) {
            int gap = max - candy;
            if (gap <= extraCandies) {
                check.add(true);
            } else {
                check.add(false);
            }
        }
        return check;
    }
}
