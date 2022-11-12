package com.prachi;

public class Exercise3 {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,4,4};
        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j=0;j< arr.length;j++){
                if(arr[i]==arr[j])
                    count+=1;
                System.out.println(arr[i]+" occures "+count+" times");
            }
        }
    }
}