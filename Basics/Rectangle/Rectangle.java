package com.prachi;

public class Rectangle {
    double width;    // default modifier private
     double height;// same as above
    public Rectangle(){
        this.width=1; // default values
        this.height=1;
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height; //height is static variable thats why we called it like this
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

