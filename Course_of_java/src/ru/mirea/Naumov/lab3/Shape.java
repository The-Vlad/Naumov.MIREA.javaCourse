package ru.mirea.Naumov.lab3;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "Blue";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString(){
        return "Some shape.\nColor: "+this.color+"\nIs filled?: "+filled;
    }
}
