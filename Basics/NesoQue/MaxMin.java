package com.prachi;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int n= input.nextInt();
        if (n>0) {
            int max = n;
            int min = n;
            while (n > 0) {
                //System.out.print(n+" ");
                n = input.nextInt();
                if (n > max)
                    max = n;
                if (n < min)
                    min = n;
            }
            System.out.println("max is :" + max);
            System.out.println("min is :" + min);
        }
        else
            System.out.println("Invalid number");
    }
}