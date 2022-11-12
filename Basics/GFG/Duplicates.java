package com.project;

import java.util.ArrayList;
import java.util.Arrays;


public class Duplicates {
    public static void main(String[] args) {
        duplicates(new int[]{2, 3, 1, 2,2}, 5);
        duplicates(new int[]{0,3,1,2},4);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(arr);
        int flag = 0;

        for (int i = 0; i < n-1; i++) {
            int j=i+1;
            while(arr[i]!=arr[j] && j<n-1 ){
               j++;
            }
            //System.out.println(j);

            if (arr[i] == arr[j] ) {
                result.add(arr[i]);
                flag = 1;
            }
        }
        // if we found result=2 2
        //to remove repeated element (using iterator)
        ArrayList<Integer> newResult = new ArrayList<Integer>();
        for (int element:result){
            if(!newResult.contains(element))
                newResult.add(element);
        }
        if (flag != 1) {
            newResult.add(-1);
        }
        System.out.println(newResult.);
        return newResult;


    }
}

