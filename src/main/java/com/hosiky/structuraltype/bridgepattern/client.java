package com.hosiky.structuraltype.bridgepattern;

/**
 * 背景：
 *
 * 在软件开发中，我们常常遇到多层次的继承结构。例如，有一个抽象类 Shape 表示各种形状，然后派生出具体的形状类 Circle、Rectangle 等。
 * 接着，又有另一个维度的变化，比如颜色。我们可能想在 Circle 和 Rectangle 类中加入颜色属性，但这样会导致类的爆炸式增长。
 *
 * 解决方案：
 *
 * 桥接模式通过将抽象部分和实现部分分离，建立一个桥接（Bridge）来连接它们。抽象部分拥有一个指向实现部分的引用，从而使得两者可以独立地变化。
 * 这样，我们可以通过组合关系来避免继承的复杂性，而将变化的维度从继承结构中解耦出来。
 *
 * 实现方式：
 *
 * 桥接模式的关键是将抽象部分和实现部分分离，并通过组合关系将它们连接在一起。在实现桥接模式时，
 * 通常会定义一个抽象部分的接口和实现部分的接口，然后创建具体的实现类来实现这些接口
 *
 */
public class client {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color greenColor = new GreenColor();

        Shape redCircle = new Circle(redColor);
        Shape greenCircle = new Square(greenColor);

        redCircle.applyColor();
        greenCircle.applyColor();
    }
}
