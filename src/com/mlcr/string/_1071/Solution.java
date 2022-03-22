package com.mlcr.string._1071;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/ 字符串的最大公因子
 * @author: fynch3r
 * @create: 2021-06-12 15:56
 **/


public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        return str1.substring(0,gcd(str1.length(),str2.length()));

    }

    public int gcd(int length1,int length2){
        if(length2 == 0){
            return length1;
        }
        else{
            return gcd(length2,length1%length2);
        }
    }

}
