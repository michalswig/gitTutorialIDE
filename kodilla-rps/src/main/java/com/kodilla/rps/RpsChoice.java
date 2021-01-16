package com.kodilla.rps;

public enum RpsChoice {
    ROCK,
    PAPER,
    SCISSORS;

    public int wins(RpsChoice rpsChoice) {
        if(this == rpsChoice)
            return 0;
        else if ((this == RpsChoice.ROCK) && (rpsChoice == RpsChoice.SCISSORS)){
            return 1;
        }
        else if ((this == RpsChoice.PAPER) && (rpsChoice == RpsChoice.ROCK)) {
            return 1;
        }
        else if ((this == RpsChoice.SCISSORS) && (rpsChoice == RpsChoice.PAPER)) {
            return 1;
        } else {
            return 2;
        }
    }
}
