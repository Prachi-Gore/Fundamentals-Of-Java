package com.project;

public class Builder {


    public static void main(String[] args) {
        //Declaration
        StringBuilder sb = new StringBuilder("prachi");
        System.out.println(sb);
        //Get A Character from Index
        System.out.println(sb.charAt(0));
        // Set or update a Character at Index
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        //Insert or add a Character at Some Index
        sb.insert(0, 'S');
        System.out.println(sb);
        //Delete char at some Index
        sb.delete(0, 1); //[start,end)
        System.out.println(sb);
        //Append a char
        // Append means to add something at the end.
        sb.append(" Stark");
        System.out.println(sb);
        //Print Length of String
        System.out.println(sb.length());
        reverse(new StringBuilder("I Love Programming"));
    }

        //Reverse a String (using StringBuilder class)
        public static void reverse(StringBuilder sb) {
           // StringBuilder sb = new StringBuilder("HelloWorld");

            for(int i=0; i<sb.length()/2; i++) {
                int front = i;
                int back = sb.length() - i - 1;

                char frontChar = sb.charAt(front);
                char backChar = sb.charAt(back);

                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
            }

            System.out.println(sb);
        }
}
