package ru.mirea.Naumov.lab7;
import java.lang.*;
import java.util.Stack;
import java.util.Scanner;

public class Game1 {
    Stack firstSet = new Stack();
    Stack secondSet = new Stack();

    int Player1_Card;
    int Player2_Card;
    int stepCounter = 0;
    boolean gameOver = false;

    public Game1(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter set of Player 1:");
        for (int i = 0; i < 5; i++) firstSet.add(0, input.nextInt());

        System.out.println("Enter set of Player 2:");
        for (int i = 0; i < 5; i++) secondSet.add(0, input.nextInt());

        while(!gameOver){
            Player1_Card = (int)firstSet.pop();
            Player2_Card = (int)secondSet.pop();
            stepCounter++;

            if(stepCounter > 106) {
                System.out.println("botva");
                gameOver = true;
                break;
            }

            if (Player1_Card == 0 && Player2_Card == 9){
                firstSet.add(0, Player1_Card);
                firstSet.add(0, Player2_Card);
            }
            if (Player1_Card == 9 && Player2_Card == 0){
                secondSet.add(0, Player1_Card);
                secondSet.add(0, Player2_Card);
            }
            else if (Player1_Card > Player2_Card){
                firstSet.add(0, Player1_Card);
                firstSet.add(0, Player2_Card);
            }
            else{
                secondSet.add(0, Player1_Card);
                secondSet.add(0, Player2_Card);
            }

            if (firstSet.size() == 10){
                gameOver = true;
                System.out.println("first "+stepCounter);
            }
            else if (secondSet.size() == 10){
                gameOver = true;
                System.out.println("second "+stepCounter);
            }
        }
    }

    public static void main(String[] args){
        new Game1();
    }
}
