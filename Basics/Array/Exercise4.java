package com.prachi;

public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 3, 4, -4};
        int max=arr[0];int min=arr[0];
        for (int i=1;i< arr.length;i++) {
            if (max <= arr[i])
                max = arr[i];
            else
                min = arr[i];
        }
            System.out.println("max : "+max+" min : "+min);
        }
    }
