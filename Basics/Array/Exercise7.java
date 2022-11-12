package com.prachi;

public class Exercise7 {
    public static void main(String[] args) {
        int[][] numbers ={{1, 4, 3, 4}, {6, 6, 7, 8}, {19, 10, 11, 12}};
        for (int i=0;i< numbers.length;i++){
            int max=numbers[i][0];
            for (int j=1;j<4;j++){
               // if (max<numbers[i][j])
               //     max=numbers[i][j];
                max=max<numbers[i][j]?numbers[i][j]:max; // unary operator
            }
            System.out.println("Max of row "+(i+1)+": "+max);
        }
    }
}