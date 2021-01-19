package com.kodilla.rps2;

public enum ChoiceType {
    ROCK,
    PAPER,
    SCISSORS,
    SPOCK,
    LIZARD;

    public int winLogic(ChoiceType choiceType) {

        if(this == choiceType){
            return 0;
        } else if((this == ChoiceType.ROCK) && (choiceType == ChoiceType.SCISSORS)
                || (this == ChoiceType.ROCK) && (choiceType == ChoiceType.LIZARD)
                 || (this == ChoiceType.PAPER) && (choiceType == ChoiceType.ROCK)
                 || (this == ChoiceType.PAPER) && (choiceType == ChoiceType.SPOCK)
                 || (this == ChoiceType.SCISSORS) && (choiceType == ChoiceType.PAPER)
                 || (this == ChoiceType.SCISSORS) && (choiceType == ChoiceType.LIZARD)
                 || (this == ChoiceType.LIZARD) && (choiceType == ChoiceType.SPOCK)
                 || (this == ChoiceType.LIZARD) && (choiceType == ChoiceType.PAPER)
                 || (this == ChoiceType.SPOCK) && (choiceType == ChoiceType.SCISSORS)
                 || (this == ChoiceType.SPOCK) && (choiceType == ChoiceType.ROCK) )
        {
            return 1;
        } else {
            return 2;
        }
    }



}
