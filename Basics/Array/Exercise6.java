package com.prachi;

public class Exercise6 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i=0;i< numbers.length;i++){
            int sum=0;
            for (int j=0;j<numbers[i].length;j++)
                sum += numbers[i][j];
            System.out.println("Sum of Row "+(i+1)+": "+sum);
        }
        System.out.println();
        Exercise6 obj=new Exercise6();//creating object of class to access method
        obj.colSum();
    }
    public void colSum(){           // or we can use here static
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int j=0;j<4;j++) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++)
                sum += numbers[i][j];
            System.out.println("Sum of col " + (j + 1) + ": " + sum);
        }
    }
}