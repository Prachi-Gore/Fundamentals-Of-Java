package com.prachi;

import java.util.Scanner;

public class Loop14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive integer : ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("* ");
            System.out.println();
        }

    }
}