package com.zdk.suanfan.sort;

public class Utils {
    /***
     * 数组格式化
     * @param arr
     * @return
     */
    public static  String toStr (int arr[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < arr.length; i++) {
            stringBuilder.append(arr[i]);

            if (i  < arr.length -1) {
                stringBuilder.append(",");

            }

        }

        return  stringBuilder.toString();

    }

    /**
     * 交换
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int [] arr, int a, int b){
        int temp =  arr[a];
        arr[a] =  arr[b];
        arr[b] = temp ;

    }
}
