package com.kodilla.rps2;

public class HumanPlayerOne extends Player{

    public HumanPlayerOne(String name) {
        super(name, new HumanInterface());
    }

    //w konstruktorze mamy obiekt "new HumanInterface"

}
