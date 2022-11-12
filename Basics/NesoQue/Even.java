package com.prachi;

public class Even {

    public static void main(String[] args) {
//	  for (int i=1;i<=100;i++){   // i+=2 i.e i=i+2 and remove if condition
//          if (i%2!=0)
//              continue;      //this is an optional
//          System.out.print(i+" ");
//      }
//        System.out.println();
//    reverseEven();
    whileLoop();
    }
    public static void reverseEven(){
        for (int i=100;i>=1;i--){             // i-=2 i.e i=i-2
            if (i%2==0)
                System.out.print(i+" ");
        }
    }
    public static void whileLoop(){
        int i=2;
        while (i<=100){
            System.out.print(i+" ");
            i+=2;
        }
    }
}
