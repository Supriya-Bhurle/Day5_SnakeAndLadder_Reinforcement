package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static public final int Starting_Position_Of_Player = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Problem");
 uc2_RollTheDice
        Random random = new Random();
        int diceRoll = random.nextInt(7);

        System.out.println("current position : "+diceRoll);

        System.out.println("Current Position of player : " + Starting_Position_Of_Player);


    }
}
