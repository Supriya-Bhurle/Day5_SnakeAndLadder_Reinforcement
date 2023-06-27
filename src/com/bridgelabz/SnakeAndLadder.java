package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static public final int Starting_Position_Of_Player = 0;
    static public final int Ending_Position_Of_Player = 100;
    public static final int Ladder = 2;
    public static final int Snake = 1;
    public static final int NoPlay = 0;
    public static int rolldie(){
        int dieValue =(int)Math.floor(Math.random()*10)%6+1;
        return dieValue;
    }
    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder program");

        int rolldie = rolldie();
        int currentPosition = 0;
        int checkPosition= (int)Math.floor(Math.random()*10)%3;
        switch (checkPosition){
            case Snake:
                currentPosition = rolldie - Snake;
                System.out.println("player is on Snake " +checkPosition);
                break;
            case  Ladder:
                currentPosition = Ladder + rolldie;
                System.out.println("player is on Ladder " +currentPosition);
                break;
            default:
                System.out.println("player is not playing " );

    }
}}
