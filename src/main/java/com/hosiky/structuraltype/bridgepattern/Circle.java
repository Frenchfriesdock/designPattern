package com.hosiky.structuraltype.bridgepattern;

public class Circle extends Shape {

//    作用是调用父类的构造方法
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("圆形");
        color.applyColor();
    }
}
