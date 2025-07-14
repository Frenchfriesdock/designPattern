package com.hosiky.behavioralpatterns.templatemethodpattern;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket played");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket ended");
    }
}
