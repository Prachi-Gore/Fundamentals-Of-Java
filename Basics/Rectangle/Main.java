package com.prachi;

import java.util.Arrays;
import java.util.Scanner;

// create an array of 3 rectangles read from the user and print attributes(hei,wid)of each rectangle
public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3]; //create an array of size 3 and type is Reactangle
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Do You want to Enter Width and height (Y/N) : ");
            char choice = input.next().charAt(0);
            if (choice == 'Y')
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());//initiate the object rectangles
            else
                rectangles[i] = new Rectangle(); // assign default values
        }


        System.out.println("Reactangles are :");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i + 1) + " Width: " + rectangles[i].getWidth() + " Height: " + rectangles[i].getHeight()
                    + " Area: " + rectangles[i].getArea() + " Perimeter: " + rectangles[i].getPerimeter());
        }
    }
}
