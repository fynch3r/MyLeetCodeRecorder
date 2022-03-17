package com.mlcr.sort;

import java.util.Arrays;

/**
 * @program: MyLeetCodeRecorder
 * @description:
 * @author: fynch3r
 * @create: 2021-06-17 16:10
 **/


public class MergeSort {
    public static void main(String[] args) {
        int[] array = {34, 2324, 543, 53, 43, 53, 42, 0, -32};
        System.out.println("before bubblesort array = " + Arrays.toString(array));
        System.out.println("after bubblesort array = " + Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array) {
        //结束条件
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    //将两段分别有序的数组合并
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }
}
