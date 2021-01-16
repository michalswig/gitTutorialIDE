package com.kodilla.rps;

public class Player {
    private String name;
    private RpsChooser rpsChooser;

    public Player(String name, RpsChooser rpsChooser) {
        this.name = name;
        this.rpsChooser = rpsChooser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RpsChoice getPlayerChoice() {
        return rpsChooser.getChoice();
    }




}
