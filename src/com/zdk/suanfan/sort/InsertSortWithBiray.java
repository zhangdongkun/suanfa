package com.zdk.suanfan.sort;

public class InsertSortWithBiray {



    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int low = 0, high = i - 1;
            int mid = -1;
            while ( high > low) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                    // 元素相同时，也插入在后面的位置
                } else {
                    low = mid + 1;

                }
            }

        //while循环完后，low=high+1,此时low为当前插入数字所待坑位
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            System.out.println("-----------------"+low);
            arr[low] = temp;
            System.out.println(Utils.toStr(arr));

        }



    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1,6,4};
        sort(arr);
      //  System.out.println(Utils.toStr(arr));
        /**
        1 * 5, 3, 2, 1, --- >  5 5  2 1 --->3 ---> 3 5 2 1
            3 5 2 1--->   2 3 5 1
         2 3 5 1
         2  2 3 5
         */
    }
}

