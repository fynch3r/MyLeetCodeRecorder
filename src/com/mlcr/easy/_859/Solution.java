package com.mlcr.easy._859;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/buddy-strings/
 * @author: fynch3r
 * @create: 2021-07-14 16:25
 **/


public class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A == "" || B == "" || A.length() != B.length()) {
            return false;
        }
        // 如果A==B , 那么只要有两个重复元素就可以了
        if (A.equals(B)) {
            for (int i = 0; i < A.length() - 1; i++) {
                if (A.indexOf(A.charAt(i), i + 1) != -1) { // 如果从i+1的位置开始，遇到了一个重复元素
                    return true;
                }
            }
            return false;
        }
        // 如果A!=B 那么先遍历A一次 找到不同的元素
        // 如果不同元素的个数为>2 false
        // 交换A中不同的元素 再和B比较
        int index1=-1, index2 = -1, count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
                if(count == 1){
                    index1 = i;
                }else if(count == 2){
                    index2 = i;
                }else{
                    return false; // >2的情况
                }
            }
        }
        return count == 2 && A.charAt(index1) == B.charAt(index2) && A.charAt(index2) == B.charAt(index1);
    }
}
