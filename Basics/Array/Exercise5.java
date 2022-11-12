package com.prachi;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 11, 3, 4,10, -4,};
        int[] new_arr=new int[arr.length];
        int j=0;int k=arr.length-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2!=0) {
                new_arr[j] = arr[i];
                j++;
            }
            else {
                new_arr[k] = arr[i];
                k--;
            }
        }
        arr=new_arr;
        System.out.println(Arrays.toString(arr));
    }
}