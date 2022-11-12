package com.prachi;

import java.util.Scanner;

public class StrSpace {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = input.nextLine();
        int len=s.length();
        //System.out.println(len);
        for (int i=0;i<len;i++)
           System.out.print(s.charAt(i)+" ");
   }
}
