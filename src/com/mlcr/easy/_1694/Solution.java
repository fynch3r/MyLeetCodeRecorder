package com.mlcr.easy._1694;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/reformat-phone-number/
 * @author: fynch3r
 * @create: 2021-06-12 18:33
 **/


public class Solution {
    public String reformatNumber(String number) {
        String res = "";
        number = number.replace(" ", "").replace("-", "");
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int count = 0;

        if (len % 3 == 0 || len % 3 == 2) {
            for (int j = 0; j < len; j++) {
                sb.append(number.charAt(j));
                count++;
                if (count == 3 && j != len - 1) { //j != len-1 避免最后位置拼接"-"
                    sb.append("-");
                    count = 0; //重新计数
                }
            }
        } else {
            for (int j = 0; j < len; j++) {
                sb.append(number.charAt(j));
                count++;
                if (count == 3) {
                    sb.append("-");
                    count = 0;
                }
                if (len - 1 - j == 2 && count == 2) { //表示还剩2位，比如123-4567，此时在45后面拼"-"
                    sb.append("-");
                    count = 0; //需要置为0
                }
            }
        }

        return sb.toString();
    }
}
