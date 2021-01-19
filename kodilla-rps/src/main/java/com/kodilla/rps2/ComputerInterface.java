package com.kodilla.rps2;

import java.util.Random;

public class ComputerInterface implements ChoiceInterface{
    @Override
    public ChoiceType getChoice() {
        Random random = new Random();
        int computerPlayer = random.nextInt(4) + 1;
        System.out.println("Computer move was : " + ChoiceType.values()[computerPlayer]);
        return ChoiceType.values()[computerPlayer];
    }
}
