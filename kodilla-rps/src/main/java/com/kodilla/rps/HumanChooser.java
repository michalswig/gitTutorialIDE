package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.RpsRunner.playerName;

public class HumanChooser implements  RpsChooser{

    @Override
    public RpsChoice getChoice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Make your choice 0: ROCK, 1: PAPER, 2: SCISSORS");
        int playerInput = in.nextInt();
        System.out.println(playerName + " move: " + RpsChoice.values()[playerInput]);
        return RpsChoice.values()[playerInput];
    }


}
