package com.hosiky.creativestructure.abstractfactorypattern;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowTextField();
    }
}
