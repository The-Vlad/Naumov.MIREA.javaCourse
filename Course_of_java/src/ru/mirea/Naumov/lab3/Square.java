package ru.mirea.Naumov.lab3;
import java.lang.*;

class Square extends Rectangle {
    public Square(){
        width = 1;
        length = 1;
    }
    public Square(double side){
        width = side;
        length = side;
    }
    public Square (double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    public void setWidth(double side){
        width = side;
        length = side;
    }

    public void setLength(double side){
        width = side;
        length = side;
    }

    public String toString(){
        return "Shape: Square.\nSide: "+this.width+"\nColor: "+this.color;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return width * 2 + length * 2;
    }
}
