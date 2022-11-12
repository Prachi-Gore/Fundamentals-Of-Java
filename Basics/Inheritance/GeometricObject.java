package com.prachi;

public abstract class GeometricObject {
    private boolean isFilled;
    private String color;

   protected GeometricObject(){}

   protected GeometricObject(boolean isFilled,String color){
       this.isFilled=isFilled;
       this.color=color;
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "GeometricObject{" +
                "isFilled=" + isFilled +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
