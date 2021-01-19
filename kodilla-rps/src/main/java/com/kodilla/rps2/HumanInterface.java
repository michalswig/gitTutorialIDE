package com.kodilla.rps2;

import java.util.Scanner;

public class HumanInterface implements ChoiceInterface {
    @Override
    public ChoiceType getChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can choose: \n" +
                "    0 - ROCK,\n" +
                "    1 - PAPER,\n" +
                "    2 - SCISSORS,\n" +
                "    3 - SPOCK,\n" +
                "    4 - LIZARD;");
        System.out.println("Enter your choice.");
        int playerChoice = scanner.nextInt();
        System.out.println("Your move was: " + ChoiceType.values()[playerChoice]);
        return ChoiceType.values()[playerChoice];
    }
}
