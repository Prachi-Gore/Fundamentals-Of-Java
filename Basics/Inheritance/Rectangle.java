package com.prachi;

public class Rectangle extends GeometricObject {// rectangle class inherite geo..class
         private double height;
          private double width;

          Rectangle(){}

          Rectangle(double width,double height){}

          Rectangle(boolean isFilled,String color,double width,double height){

              //setFilled(isFilled);
              // setColor(color);
              super(isFilled,color);
              this.height=height;
              this.width=width;
          }
          @Override
          double getArea(){
              return this.height*this.width;
          }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
