package com.prachi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
  //      Scanner input = new Scanner(System.in);
//        int sum = 0;
//        while (sum<=100){
//            System.out.print("Enter an intger number: ");
//            sum=sum+input.nextInt();
//        }
//        System.out.println("Done");
        sumOfDigits();
    }
    public static void sumOfDigits(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=input.nextInt();
        int sum=0;
        while(n>0){
            sum+= n%10 ;
            n/=10;
        }
        System.out.println("sum of digits: "+sum);

       // (n%10)+(n/10)%10+(n/100)

}
}