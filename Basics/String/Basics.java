package com.project;

public class Basics {
    public static void main(String[] args){
        // concatenation
        String firstName="Prachi";
        String lastName="Gore";
        String fullName=firstName+lastName;
        // in string class there will be 3 pointer for above(concatenation)
        //so we refer string builder class there will be 1 pointer for above
        //length
        System.out.println(firstName.length());
        //charAt(index)
        System.out.println(fullName.charAt(1));
        //compare
        String name1="ijklh";
        String name2="ij";
        System.out.println(name1.compareTo(name2));
        // 0:both are equal
        //-ve: Unequal
        //+ve: Unequal
       //==
        System.out.println(name1==name2);
       // substring(start index)//[start, ]
        System.out.println(name1.substring(1));
      //  substring(start index,end index)//[start,end)
        System.out.println(name1.substring(1,3));

    }
}
