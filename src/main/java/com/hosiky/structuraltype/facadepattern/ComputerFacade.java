package com.hosiky.structuraltype.facadepattern;

public class ComputerFacade {

    private Computer computer;

    public ComputerFacade() {
        this.computer = new Computer();
    }

    public void startComputer() {
        computer.start();
    }

    public void shutDownComputer() {
        computer.shutdown();
    }
}
