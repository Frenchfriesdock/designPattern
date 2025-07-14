package com.hosiky.structuraltype.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {
    private Map<String, ChessPiece> chessPieces = new HashMap<>();

    public ChessPieceFactory() {
        this.chessPieces = new HashMap<>();
    }

    public ChessPiece getChessPiece(String color) {
        ChessPiece chessPiece = chessPieces.get(color);
        if (chessPiece == null) {
            chessPiece = new ConcreteChessPiece(color);
            chessPieces.put(color, chessPiece);
        }
        return chessPiece;
    }
}
