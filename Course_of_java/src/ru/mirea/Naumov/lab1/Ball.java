package ru.mirea.Naumov.lab1;
import java.lang.*;

public class Ball {
    private double radius;
    private double volume;
    private int cost;

    public Ball(double r, int c){
        radius = r;
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
        cost = c;
    }
    public Ball(int c) {
        radius = 1;
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
        cost = c;
    }
    public Ball(double r){
        radius = r;
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
    }
    public Ball(){
        radius = 1;
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
        cost = 1;
    }

    public void setRadius(double radius){
        this.radius = radius;
        volume = (4/3)*Math.PI*Math.pow(radius, 3);
    }
    public void setVolume(double volume){
        this.volume = volume;
        radius = Math.pow((volume*3)/(4*Math.PI), 1/3);
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    public double getRadius(){
        return radius;
    }
    public double getVolume(){
        return  volume;
    }
    public int getCost(){
        return cost;
    }

    public String toString(){
        return "The ball's radius is: "+radius+", volume: "+volume+", cost: "+cost;
    }
}
