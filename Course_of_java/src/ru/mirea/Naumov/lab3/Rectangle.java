package ru.mirea.Naumov.lab3;
import java.lang.*;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        color = "Blue";
        filled = false;
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        color = "Blue";
        filled = false;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public String toString(){
        return "Shape: Rectangle.\nLength: "+this.length+
               "\nWidth: "+this.width+"\nColor: "+this.color;
    }
}
