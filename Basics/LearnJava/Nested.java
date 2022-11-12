package com.prachi;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter an integer number: ");
        int n= input.nextInt();
        if(n>10)
            System.out.println(n+" is greater than 10");
        else if(n<10)
            System.out.println(n+" is less than 10");
        else
            System.out.println(n+" is equal to 10");
    }
}
