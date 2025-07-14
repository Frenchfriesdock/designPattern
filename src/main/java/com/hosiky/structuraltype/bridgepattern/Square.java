package com.hosiky.structuraltype.bridgepattern;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("矩形");
        color.applyColor();
    }
}
