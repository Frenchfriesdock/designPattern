package com.hosiky.structuraltype.decoratorpattern;

public class SimpleCoffee implements Coffee {


    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "普通咖啡";
    }
}
