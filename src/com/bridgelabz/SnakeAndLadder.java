package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Problem");
        Random random = new Random();
        int diceRoll = random.nextInt(7);

        System.out.println("current position : "+diceRoll);
    }
}
