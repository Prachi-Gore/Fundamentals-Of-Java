package com.prachi;

import java.util.Scanner;

public class Loop14B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive integer : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i==1||i==n){
                for (int j=1;j<=n;j++)
                    System.out.print("*");
                System.out.println();
            }
            else{
                System.out.print(" ");
                for (int j=1;j<=n-2;j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}