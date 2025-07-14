package com.hosiky.creativestructure.abstractfactorypattern;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
