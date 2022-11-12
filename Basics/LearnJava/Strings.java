package com.prachi;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String s1 = "I Love Logical Subjects like Maths,Stats, Programming"; // String is classes with object s1 & further we will call s1
        String s2=" wohh! ";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s1.indexOf('g'));
        System.out.println(s1.lastIndexOf('g')); // where is last g
        System.out.println(s1.concat(s2));
        System.out.println(s1);
        System.out.println("My fav no. is "+ 2+ 9);
        System.out.println("My fav no. is "+ (2+9));
        System.out.println("hi".concat(" prachi"));
        System.out.println("hi".concat(" prachi").toUpperCase());





    }
}