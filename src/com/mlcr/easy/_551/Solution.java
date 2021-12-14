package com.mlcr.easy._551;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/student-attendance-record-i/
 * @author: 0range
 * @create: 2021-06-12 14:11
 **/


public class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        int len = s.length();
        for(int i = 0;i<len;i++){
            char c = s.charAt(i);
            if(c == 'A'){
                a++;
                if(a>1){
                    return false;
                }
                l = 0;
            }else if(c == 'L'){
                l++;
                if(l>2){
                    return false;
                }
            }else{
                //都不是需要重置L计数器
                l = 0;
            }
        }
        return true;
    }
}
