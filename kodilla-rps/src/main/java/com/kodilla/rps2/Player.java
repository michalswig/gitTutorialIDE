package com.kodilla.rps2;

public class Player {
    private String name;
    private ChoiceInterface choiceInterface;

    public Player(String name, ChoiceInterface choiceInterface) {
        this.name = name;
        this.choiceInterface = choiceInterface;
    }

    public ChoiceType playerChoice() {
        return choiceInterface.getChoice();
    }


    //nie rozumiem pola interfejsu i metody playerChoice

}
