package com.prachi;

import java.util.Scanner;

public class Loop {
   public static void main(String[] args) {
 //         System.out.print("enter a number between 1 and 10: ");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        while (n <1 || n> 10) {
//            System.out.print(n + " is not between 1 and 10. Try again: ");
//            n = input.nextInt();
//        }
//        System.out.print(n+" is between 1 and 10. Thanks!");
//    doWhile();
       forLoop();
   }
//    public static void doWhile(){
//        Scanner input = new Scanner(System.in);
//        int n;
//        do {
//            System.out.print("enter a number between 1 and 10: ");
//            n = input.nextInt();
//        } while (n<1 || n> 10);
//        System.out.print(n+" is between 1 and 10. Thanks!");
//    }
      public static void forLoop(){
         for(int i=1;i<=10;i++){
             for(int j=1;j<=10;j++) {
                 System.out.print((i * j)+" ");
             }
             System.out.println();
         }
    }
}
