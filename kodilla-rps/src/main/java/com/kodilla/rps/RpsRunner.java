package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {


        int roundsNumber = howManyRounds();
        String playerName = playerName();
        Player playerOne = new Human(playerName);
        //playerOne.setName(playerName());
        Player playerTwo = new Computer("AI");
        int winNumberPlayerOne = 0;
        int winNUmberPlayerTwo = 0;

        int counter = 1;
        while (counter < roundsNumber){

            RpsChoice playerOneChoice = playerOne.getPlayerChoice();
            RpsChoice playerTwoChoice = playerTwo.getPlayerChoice();

            if(playerOneChoice.wins(playerTwoChoice) == 0) {
                winNumberPlayerOne++;
                winNUmberPlayerTwo++;
                System.out.println("round number " + counter + " its a draw");
            }  else if(playerOneChoice.wins(playerTwoChoice) == 1) {
                winNumberPlayerOne++;
                System.out.println("round number " + counter + ": " + playerOne.getName() + " has won");
            } else {
                winNUmberPlayerTwo++;
                System.out.println("round number " + counter + ": " + playerTwo.getName() + " has won");
            }
            counter++;
        }
        System.out.println();
        System.out.println("*************");
        System.out.println("Game is finished, we have " + counter + " rounds this time" );
        System.out.println("Score: " + playerOne.getName() + ": " + winNumberPlayerOne + " points won " + " vs. " + playerTwo.getName() + ": " + winNUmberPlayerTwo + " points won");

        if(winNumberPlayerOne == winNUmberPlayerTwo) {
            System.out.println("its a draw!");
        }
        else if (winNumberPlayerOne > winNUmberPlayerTwo) {
            System.out.println( playerOne.getName() + " has won!");
        } else {
            System.out.println("AI has won!");
        }
    }

    public static int howManyRounds() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rounds you wish to play?");
        return in.nextInt();
    }

    public static String playerName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write PLayer`s name:");
        return in.next();
    }
}