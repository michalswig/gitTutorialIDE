package com.kodilla.rps2;

public class ComputerPlayerTwo extends Player {

    public ComputerPlayerTwo(String name) {
        super(name, new ComputerInterface());
    }
}
