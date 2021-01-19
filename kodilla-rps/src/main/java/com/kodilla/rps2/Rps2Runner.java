package com.kodilla.rps2;

import java.util.Scanner;

public class Rps2Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        String playersName = enterPlayersName();
        int roundsNumberToChoose = howManyRounds();
        int countRounds = 0;
        int playerOnePoints = 0;
        int computerPoints = 0;
        Player playerOne = new HumanPlayerOne(playersName);
        Player computerPlayer = new ComputerPlayerTwo("Computer");


        while(countRounds < roundsNumberToChoose){

            ChoiceType playerOneChoice = playerOne.playerChoice();
            ChoiceType playerTwoChoice = computerPlayer.playerChoice();

            if(playerOneChoice.winLogic(playerTwoChoice) == 0){
                playerOnePoints++;
                computerPoints++;
                System.out.println("it's a tie!");
            } else if(playerOneChoice.winLogic(playerTwoChoice) == 1) {
                playerOnePoints++;
                System.out.println("You win You lucky! :)");
            } else {
                computerPoints++;
                System.out.println("This time you lost!");
            }
            countRounds++;
        }
        System.out.println(" ");
        System.out.println("*****************");
        System.out.println("Game is finished!");
        System.out.println("Score: " + playersName + " got " + playerOnePoints + " points, Computer got " + computerPoints + " points");

        if(playerOnePoints == computerPoints){
            System.out.println("its a final draw!");
        } else if(playerOnePoints > computerPoints) {
            System.out.println(playersName + " has won! Big Ups!");
        } else {
            System.out.println("This time Computer has won! Try again!");
        }
    }

    public static String enterPlayersName() {
        System.out.println("Please enter Player`s Name...");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int howManyRounds() {
        System.out.println("Now enter number of rounds TicTacToe you wish to play...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }



}
