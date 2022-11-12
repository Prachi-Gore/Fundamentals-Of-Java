package com.prachi;

import java.awt.*;//Point

public class Circle {
    // Declaring Attributes(as we are declaring it directly inside the class )
    Point center;
    double radius;
    // create constructor
    Circle(){}      // 1st constructor with no paramter

    Circle(Point center,double radius){ //2nd constructor with 2 parameter
        this.center=center; //attribute center/radius is same as parameter center/radius
        this.radius=radius;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getArea(){
       return 2*Math.PI*Math.pow(radius,2);
    }
    void setCenter(Point center){
        this.center=center;
    }
    void setRadius(double radius){
        this.radius=radius;
    }

}
