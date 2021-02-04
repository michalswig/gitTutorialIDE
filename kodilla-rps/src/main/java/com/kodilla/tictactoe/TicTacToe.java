package com.kodilla.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        printBoard(board);

        while (true) {
            playerTurn(board, scanner);
            if (isTheGameFinished(board)){
                break;
            }
            printBoard(board);

            computerTurn(board);
            if (isTheGameFinished(board)){
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }

    private static boolean isTheGameFinished(char[][] board) {

        if (hasWon(board, 'X')) {
            printBoard(board);
            System.out.println("You wins!");
            return true;
        }

        if (hasWon(board, 'O')) {
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("End of game, it`s a tie!");
        return true;
    }

    private static boolean hasWon(char[][] board, char symbol) {
        if( (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
            (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
            (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

            (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
            (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
            (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

            (board[0][1] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) ) {
            return true;
        }
        return false;
    }

    private static void computerTurn(char[][] board) {
        Random random = new Random();
        int computerTurn;
        while(true){
            computerTurn = random.nextInt(9)+1;
            if (isEmptySpaceToMakeTheTurn(board, computerTurn)){
                break;
            }
        }
        System.out.println("Computer choose " + computerTurn);
        placeMove(board, computerTurn, 'O');
    }

    private static boolean isEmptySpaceToMakeTheTurn(char[][] board, int position) {
        switch (position) {
            case 1:
                if (board[0][0] == ' ') {
                    return true;
                } else return false;
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void playerTurn(char[][] board, Scanner scanner) {
        int userTurn;
        while (true){
            System.out.println("now is your turn! please, make your decision (1-9) :)");
            userTurn = scanner.nextInt();
            if(isEmptySpaceToMakeTheTurn(board, userTurn)){
                break;
            } else {
                System.out.println(userTurn + "it`s not a valid move");
            }
        }
        placeMove(board, userTurn, 'X');
    }

    private static void placeMove(char[][] board, int userTurn, char figure) {
        switch (userTurn) {
            case 1:
                board[0][0] = figure;
                break;
            case 2:
                board[0][1] = figure;
                break;
            case 3:
                board[0][2] = figure;
                break;
            case 4:
                board[1][0] = figure;
                break;
            case 5:
                board[1][1] = figure;
                break;
            case 6:
                board[1][2] = figure;
                break;
            case 7:
                board[2][0] = figure;
                break;
            case 8:
                board[2][1] = figure;
                break;
            case 9:
                board[2][2] = figure;
                break;
            default:
                System.out.println(":)");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
