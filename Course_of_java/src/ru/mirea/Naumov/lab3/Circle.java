package ru.mirea.Naumov.lab3;
import java.lang.*;
import java.math.*;

class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.color = "blue";
        this.filled = false;
        this.radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }

    public String toString(){
        return "Shape: Circle.\nRadius: "+this.radius+"\nColor: "+this.color;
    }
}
