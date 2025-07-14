package com.hosiky.creativestructure.prototypepattern;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    public Circle() {
        type = "Circle";
    }
}
