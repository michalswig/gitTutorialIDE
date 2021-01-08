package com.kodilla.rps;

import java.util.Random;

public class ComputerChooser implements RpsChooser{


    @Override
    public RpsChoice getChoice() {

        Random randomAI = new Random();
//        RpsChoice aiMove = RpsChoice.PAPER;
        int aiInput = randomAI.nextInt(3);
//        switch(aiInput) {
//            case 0:
//                aiMove = RpsChoice.ROCK;
//                break;
//            case 1:
//                aiMove = RpsChoice.PAPER;
//                break;
//            case 2:
//                aiMove = RpsChoice.SCISSORS;
//                break;
//            default:
//                System.out.println("Wrong data, please try again");
//        }
//        System.out.println("Computer`s move: " + aiMove);
//        return aiMove;

        System.out.println("Computer`s move: " + RpsChoice.values()[aiInput]);
        return RpsChoice.values()[aiInput];
    }
}
