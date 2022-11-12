package com.prachi;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int n=new Scanner(System.in).nextInt();
        Point[] arr=new Point[n];
        for (int i=0;i<arr.length;i++)
            arr[i]=new Point(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        System.out.println(Arrays.toString(arr));
    }
}
