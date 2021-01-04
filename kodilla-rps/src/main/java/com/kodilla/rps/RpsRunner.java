package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        System.out.println("Start the game, make your choice:");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();
        playerName();
        howManyRounds();

        while (rounds < playerRounds) {

            String playerMove = playerMove();
            String computerMove = computerMove();

            if(playerMove.equals(computerMove)) {
                System.out.println("no winner! its a tie!");
            } else if (playerMove.equals(PAPER)) {
                System.out.println(computerMove.equals(ROCK) ? playerName + " wins!" : "Computer Wins!");
            } else  if (playerMove.equals(ROCK)) {
                System.out.println(computerMove.equals(SCISSORS) ? playerName + " wins!" : "Computer Wins!");
            } else {
                System.out.println(computerMove.equals(ROCK) ? "Computer Wins!" : playerName + " wins!");
            }
            rounds++;
        }

        System.out.println(playerName + " has been playing " + rounds + " times");

    }

    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";
    public static String playerName = "";
    public static int rounds = 0;
    public static int playerRounds = 0;

    public static int howManyRounds() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rounds you wish to play?");
        playerRounds = in.nextInt();
        return playerRounds;
    }

    public static String playerName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write PLayer`s name:");
        playerName = in.next();
        return playerName;
    }

    public static String playerMove() {
        Scanner in = new Scanner(System.in);
        System.out.println("Make your choice: ");
        String playerInput = in.next().toUpperCase();
        System.out.println(playerName + " move: " + playerInput);
        return playerInput;
    }

    public static String computerMove() {
        Random randomAI = new Random();
        String aiMove = "";
        int aiInput = randomAI.nextInt(4);
        switch(aiInput) {
            case 1:
                aiMove = ROCK;
                break;
            case 2:
                aiMove = PAPER;
                break;
            case 3:
                aiMove = SCISSORS;
                break;
            default:
                System.out.println("Wrong data, please try again");
        }
        System.out.println("Computer`s move: " + aiMove);
        return aiMove;
    }
}