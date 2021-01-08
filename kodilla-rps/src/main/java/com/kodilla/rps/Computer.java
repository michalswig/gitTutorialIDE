package com.kodilla.rps;

public class Computer extends Player{
    public Computer(String name) {
        super(name, new ComputerChooser());
    }
}
