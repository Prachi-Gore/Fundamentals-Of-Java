package com.prachi;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args){
        //userName();
        //userAge();
        System.out.println("My name is "+userName()+" and I'm "+userAge()+"years old");
    }
    public static String userName(){
        System.out.print("Enter your name: ");
        Scanner input=new Scanner(System.in)  ;
        return input.nextLine();
    }
    public static double userAge(){
        System.out.print("Enter your age: ");
        Scanner input=new Scanner(System.in)  ;
        return input.nextInt();
    }
}
