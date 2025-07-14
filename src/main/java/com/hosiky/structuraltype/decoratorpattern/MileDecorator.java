package com.hosiky.structuraltype.decoratorpattern;

public class MileDecorator extends CoffeeDecorator{

    public MileDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return super.getCost() + 2.0;
    }

    public String getDescription() {
        return super.getDescription() + ", 加牛奶";
    }
}
