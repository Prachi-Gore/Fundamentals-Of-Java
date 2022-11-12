package com.prachi;

import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
//       Scanner input=new Scanner(System.in);
//        System.out.println(2*input.nextInt());
//        float f=input.nextFloat();
//        System.out.println(f);
//        boolean b=input.nextBoolean();
//        System.out.println(b);
//        exercise1();
        exercise2();
    }
//    public static void exercise1(){
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter your favourite iteger ");
//        int favouriteNumber=input.nextInt();
//        System.out.println(favouriteNumber+" is my favourite number too !");
//}
    public static void exercise2(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter yur name and age: ");
       // String name=input.nextLine();
        //System.out.print("Enter yur age: ");
       // int age=input.nextInt();
       // System.out.println("Enter your name and age: "+name + age);
        System.out.println(input.nextLine()+" ! you are "+input.nextInt()+" years old");

    }

}
