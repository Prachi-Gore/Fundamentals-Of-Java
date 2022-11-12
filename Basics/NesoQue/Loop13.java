package com.prachi;

import java.util.Scanner;

public class Loop13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter +ve no. ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {         // No. of rows
            for (int j = 1; j <= n - i; j++)  // spaces before 1st star in each row
                    System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i==n)
                    System.out.print("*");
                else
                    if (k == 1 || k == 2 * i - 1)  // No. of stars// here we can take j also
                        System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println();
        }
    }
}

