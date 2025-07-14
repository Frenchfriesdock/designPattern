package com.hosiky.structuraltype.flyweightpattern;

// 具体棋子类
public class ConcreteChessPiece implements ChessPiece {
    private String color;

    public ConcreteChessPiece(String color) {
        this.color = color;
    }


    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Chess Piece color: " + color + ", position: (" + x + "," + y + ")");
    }
}
