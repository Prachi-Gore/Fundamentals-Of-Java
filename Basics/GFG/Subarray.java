package com.project;

import java.util.ArrayList;

public class Subarray {
    public static void main(String[] args){
        subarraySum(new int[]{1,2,3,7,5},5,12);
        subarraySum(new int[]{1,2,3,7,5},5,11);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) // n:size of array s: required sum
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int j = 0;// start
        int sum = 0;
        int flag=0;// to check whether array contains subarray with required sum
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];

            while (sum > s) {
                sum -= arr[j];
                j++;
            }
            if (sum == s) {
                result.add(++j); // j start
                result.add(++i); // i end
                flag=1;
                break;
            }


        }
        if (flag==0)
            result.add(-1);
        System.out.println(result);
        return result;
    }
}

