package com.mlcr.medium._690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: MyLeetCodeRecorder
 * @description: https://leetcode-cn.com/problems/employee-importance/
 * @author: fynch3r
 * @create: 2021-07-13 16:34
 **/


public class Solution {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        int length = employees.size();
        for (int i = 0; i < length; i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        return counter(id);
    }

    private int counter(int id) {
        Employee employee = map.get(id);
        int value = employee.importance;

        for (Integer order : employee.subordinates) {
            Employee other = map.get(order);
            value += other.importance;
            for (Integer sub : other.subordinates) {
                value += counter(sub);
            }
        }

        return value;
    }
}
