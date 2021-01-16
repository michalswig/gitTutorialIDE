package com.kodilla.rps;

public class Human extends Player {

    public Human(String name) {
        super(name, new HumanChooser());
    }

}
