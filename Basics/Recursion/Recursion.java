package com.project;
// apna college
public class Recursion {
    // Find sum of first n natural nos.
    public static void main(String[] args) {
        //sumAsc(1,5,0);      // add 1-5 natural nos. initial sum is 0//1+2+..+5
       // sumDesc(6,6,0);// 6+5+4+..+2+1
       // System.out.println(factorial(0));
       // int first=0;int second=1;
       // System.out.print(first+" ");
        //System.out.print(second+" ");
       // fibo(3,5,0,1);// now print from 3rd to nth term
       // System.out.println(power(2,5)); // stack height=6 n=0 to 5
        System.out.println(power2(2,6));
        System.out.println(power2(2,7));
    }
    public static void sumDesc(int i,int n,int sum){
        if (i==1) {
            sum=sum+i;
            System.out.println("sum is: "+sum);
            return;
        }
        sum=sum+i;
        sumDesc(i-1,n,sum); // i+1 will be stored in i only // here i is updating i=1,2,3,4,..n
    }
    public static void sumAsc(int i,int n,int sum) {
        if (i==n) {
            sum=sum+i;
            System.out.println("sum is: "+sum);
            return;
        }
        sum=sum+i;
        sumAsc(i+1,n,sum); // i+1 will be stored in i only // here i is updating i=1,2,3,4,..n
    }
    public static int factorial(int n){
        if (n==1|| n==0)
            return 1;
        return n* factorial(n-1);

    }
    public static void fibo(int i,int n,int first,int second){
        if (i==n+1)
            return;
       // System.out.print(first+" "+second+" ");

        int third=first+second;
        System.out.print(third+" ");
       // first=second;
      //  second=third;
      //  fibo(i+1,n,first,second);
        fibo(i+1,n,second,third);
    }
    // stack height is n
    public static int power(int x,int n) { // base x power n
        if (x==0)
            return 0;
        if (n==0)
            return 1;
        return x*power(x,n-1);
    }
// stack height is how many times we are calling function

// stack height is l0gn to the base 2
public static int power2(int x,int n) { // base x power n
    if (x==0)
        return 0;
    if (n==1)
        return x;
    if(n%2==0)
        return power2(x,n/2)*power2(x,n/2); // when n is even
    else
        return power2(x,n-1)*x;                // when n is odd

 }
}

