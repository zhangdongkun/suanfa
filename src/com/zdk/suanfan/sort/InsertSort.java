package com.zdk.suanfan.sort;

import sun.security.util.Length;

/**
 * @author ZhangDongkun
 * @date：2019/7/13 21:25
 * @description：
 */
public class InsertSort {

    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {

            int index = 0;
            int temp;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > max) {
                    index = j;
                    max = arr[j];
                }

            }
            Utils.swap(arr, index, len - i - 1);

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 200, 22, 0, 12, 6, 1};
        sort(arr);
        System.out.println(Utils.toStr(arr));

    }
}
