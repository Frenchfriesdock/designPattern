package com.hosiky.structuraltype.flyweightpattern;

/**
 * 享元模式
 *
 * 背景：
 *
 * 在某些场景中，可能会出现大量相似的对象，这些对象之间只有部分状态不同，而其他部分是共享的。如果每个对象都独立创建，会导致内存占用较大，影响性能和资源使用。
 *
 * 解决方案：
 *
 * 享元模式的解决方案是将对象的共享部分抽取出来，形成一个共享的“享元”对象，它包含了对象的公共状态。然后，每个具体对象只包含自己的不同状态，
 * 通过共享享元对象来减少对象的创建数量和内存占用。
 *
 * 实现方式：
 *
 * 享元模式的核心是创建一个享元工厂（Flyweight Factory），用于管理和共享享元对象。当客户端需要创建一个对象时，首先检查享元工厂中是否存在相同状态的享元对象，
 * 如果存在，则返回该对象；如果不存在，则创建一个新的享元对象并加入到享元工厂中
 */
public class client {
    public static void main(String[] args) {
        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();

        ChessPiece blackPiece1 = chessPieceFactory.getChessPiece("black");
        ChessPiece blackPiece2 = chessPieceFactory.getChessPiece("black");

        System.out.println(blackPiece1==blackPiece2);

        ChessPiece whitePiece1 = chessPieceFactory.getChessPiece("white");
        ChessPiece whitePiece2 = chessPieceFactory.getChessPiece("white");

        System.out.println(whitePiece1==whitePiece2);

        blackPiece1.display(1,2);
        blackPiece2.display(3,4);
        whitePiece1.display(5,6);
        whitePiece2.display(7,8);

    }
}
