package com.zdk.suanfan.sort;
/**
 * @author ZhangDongkun
 * @date：2019/7/13 16:15
 * @description： 冒泡排序练习
 */
public class Bubble {

    public void sort(int [] arr) {

        int len = arr.length -1;
        int temp;

        for (int i = 0; i < len; i++) {
             for (int j = 0; j < len -i; j++ ) {
                 //相邻元素比较 前面的比后面的大就放到后面
                if (arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   System.out.println(Utils.toStr(arr));

                }


             }
             System.err.println("-------------------------"+Utils.toStr(arr));
        }



    }


    public static void main(String[] args) {
        int [] arr = {11,2,4,7,0,100,123,3,5};
        Bubble bubble = new Bubble();
        bubble.sort(arr);
    }
}
