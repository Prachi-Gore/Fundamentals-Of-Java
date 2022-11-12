package com.prachi;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int n= input.nextInt();
        int v0=0;
        int v1=1;
        long result=v0+v1;
        if(n==1)
            System.out.println("fibonaci term for n= "+n+" is: "+v0);
        else if(n==2)
            System.out.println("fibonaci term for n= "+n+" is: "+v1);
        else{
            for (int i=3;i<n;i++){
                v0=v1;
                v1=(int) result;
                result=v0+v1;
            }
            System.out.println("fibonaci term for n= "+n+" is: "+result);
        }

}
}
