package com.prachi;

import java.util.Scanner;

public class Conditional {
   public static void main(String[] args){
 //       int a,b;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter any two integer number: ");
//        System.out.println(a = input.nextInt());
//        System.out.println(b=input.nextInt());
//        if (a>b )
//            System.out.println("Maximum number is " + a);
//        else
//            System.out.println("Maximum number is " + b);
           oddEven();


    }
    public static void oddEven(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        if(input.nextInt()%2==0)
            System.out.println("it is an even integer");
        else
            System.out.println("it is odd integer");
    }
}
