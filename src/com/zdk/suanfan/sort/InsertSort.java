package com.zdk.suanfan.sort;

public class InsertSort {

    /***
     * 插入排序，从第2个元素开始遍历
     * 前面已经排后了只需要比较最后一位就可以 continue
     * 比冒泡排序效率高些
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >0 && arr[j] < arr[j-1] ; j--) {
                 Utils.swap(arr, j, j-1);

            }


        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 200, 22, 0, 12, 6, 1};
        sort(arr);
        System.out.println(Utils.toStr(arr));

    }
}
