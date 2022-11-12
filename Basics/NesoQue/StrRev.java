package com.prachi;

import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = input.nextLine();
        String reverse="";
        int len=s.length();
        for (int i=len-1;i>=0;i--)
            reverse=reverse+s.charAt(i);
        System.out.print("reverse string is: "+reverse);
    }
}