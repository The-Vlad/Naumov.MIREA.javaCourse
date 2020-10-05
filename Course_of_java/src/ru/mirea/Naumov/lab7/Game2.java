package ru.mirea.Naumov.lab7;
import java.lang.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Game2 {
    LinkedList firstSet = new LinkedList();
    LinkedList secondSet = new LinkedList();

    int Player1_Card;
    int Player2_Card;
    int stepCounter = 0;
    boolean gameOver = false;

    public Game2(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter set of Player 1:");
        for (int i = 0; i < 5; i++)
            firstSet.offer(input.nextInt());

        System.out.println("Enter set of Player 2:");
        for (int i = 0; i < 5; i++)
            secondSet.offer(input.nextInt());

        while(!gameOver){
            Player1_Card = (int)firstSet.poll();
            Player2_Card = (int)secondSet.poll();
            stepCounter++;

            if(stepCounter > 106) {
                System.out.println("botva");
                gameOver = true;
                break;
            }

            if (Player1_Card == 0 && Player2_Card == 9){
                firstSet.offer(Player1_Card);
                firstSet.offer(Player2_Card);
            }
            if (Player1_Card == 9 && Player2_Card == 0){
                secondSet.offer(Player1_Card);
                secondSet.offer(Player2_Card);
            }
            else if (Player1_Card > Player2_Card){
                firstSet.offer(Player1_Card);
                firstSet.offer(Player2_Card);
            }
            else{
                secondSet.offer(Player1_Card);
                secondSet.offer(Player2_Card);
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
        new Game2();
    }
}
