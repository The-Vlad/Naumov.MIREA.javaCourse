package ru.mirea.Naumov.lab1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(5.f, 3);
        Ball b2 = new Ball(5.f);
        Ball b3 = new Ball(8);

        b2.setCost(89);

        System.out.println("Ball 1's radius is: "+b1.getRadius());
        System.out.println("Ball 2's volume is: "+b2.getVolume());

        System.out.println(b3);
    }
}
