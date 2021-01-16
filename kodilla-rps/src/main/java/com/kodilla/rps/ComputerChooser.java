package com.kodilla.rps;

import java.util.Random;

public class ComputerChooser implements RpsChooser{


    @Override
    public RpsChoice getChoice() {
        Random randomAI = new Random();
        int aiInput = randomAI.nextInt(3);
        System.out.println("Computer`s move: " + RpsChoice.values()[aiInput]);
        return RpsChoice.values()[aiInput];
    }
}
