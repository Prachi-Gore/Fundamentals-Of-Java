package com.project;

public class Demo {

    public static void palindrome(String s) {
        // String s="madam";
        char[] a = s.toCharArray();
        // for (int i=0;i<a.length;i++)
        //     System.out.print(a[i]+" ");
        int si = 0;
        int ei = a.length - 1;// starting ending index
        boolean palindrome = true;
        while (si <ei )
            if (a[si] != a[ei]) {
                palindrome = false;
                break;
            } else {
                si++;
                ei--;
            }
        System.out.println( palindrome ? "Palindrome" : "Not Palindrome");


    }
}
