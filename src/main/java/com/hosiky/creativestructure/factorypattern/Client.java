package com.hosiky.creativestructure.factorypattern;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}

/**
 * 工厂模式是一种创建型的设计模式，他提供一种创建对象的最佳方法，而无需向客户端暴露创建逻辑，在java中，
 * 工厂类来实现对象的实例化，这样可以降低耦合性，使代码更加灵活
 *
 * 这是对某一个产品通过工厂来不断的创建和添加产品的进入
 */