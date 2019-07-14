package com.zdk.suanfan.sort;

import sun.security.util.Length;

/**
 * @author ZhangDongkun
 * @date：2019/7/13 21:25
 * @description：
 */
public class InsertSort {

    public static void sort(int[] arr) {
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {

            int index = 0;
            int temp;
            int max =0;
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > max) {
                    index = j;
                    max = arr[j];

                }


            }
            temp = arr[index];
          //  System.err.println("max---------"+max);
           // System.err.println(temp);
            arr[index] = arr[len-i];
            System.err.println("xxxxxx--------"+arr[len - i]);

            arr[len-i] = temp;


        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 8, 1,100,66,77};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
