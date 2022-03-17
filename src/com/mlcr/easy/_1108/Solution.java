package com.mlcr.easy._1108;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/defanging-an-ip-address/
 * @author: fynch3r
 * @create: 2021-06-12 16:00
 **/


public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
