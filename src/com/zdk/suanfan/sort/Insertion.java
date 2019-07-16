package com.zdk.suanfan.sort;

public class Insertion {

    /***
     * 插入排序
     * @param arr
     */
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    Utils.swap(arr, j, j-1);
                    continue;
                }

            }


        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 200, 22, 0, 12, 6, 1};
        sort(arr);
        System.out.println(Utils.toStr(arr));

    }
}
