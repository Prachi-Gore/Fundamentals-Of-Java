package com.prachi;

import java.util.Scanner;

public class Loop12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive integer : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {     // No. of rows
            for (int j = 1; j <= n-i; j++)  // No. of spaces
                System.out.print(" ");
            for (int k=1;k<=i;k++)          // No. of stars // here k is just variable even we can use j ,but its easy to understand with k
                System.out.print("*");
            System.out.println();
        }


    }
}


