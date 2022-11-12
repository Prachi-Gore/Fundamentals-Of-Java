package com.project;

public class MissingNumber {
    public static void main(String[]args){
        //missingNumber(new int[]{1,3,6,4,2},6);
    }
   static int missingNumber(int array[], int n) {
        int currentSum = 0;
        for(int i=0;i<array.length;i++){
            currentSum+=array[i];
        }
        int actualSum=n*(n+1)/2;
       System.out.println(actualSum-currentSum);
        return (actualSum-currentSum);

    }
}