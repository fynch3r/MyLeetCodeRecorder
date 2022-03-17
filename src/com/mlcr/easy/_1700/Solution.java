package com.mlcr.easy._1700;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/number-of-students-unable-to-eat-lunch/
 * @author: fynch3r
 * @create: 2021-06-12 18:33
 **/


public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int stuZero = 0, stuOne = 0;

        for (int student : students) {
            if (student == 0) {
                stuZero++;
            } else {
                stuOne++;
            }
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 1) {
                if (stuOne > 0) {
                    stuOne--;
                } else {
                    break;
                }
            } else {
                if (stuZero > 0) {
                    stuZero--;
                } else {
                    break;
                }
            }
        }

        return stuZero + stuOne;
    }
}
