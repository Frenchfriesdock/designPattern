package com.hosiky.creativestructure.builderpattern;

import lombok.Data;

@Data
public class PizzaBuilder {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(size, cheese, pepperoni, bacon);
    }
}
