package com.hosiky.creativestructure.abstractfactorypattern;

/**
 * 定义一个抽象的工厂接口
 */
public interface GUIFactory {
    public Button createButton();
    public TextField createTextField();
}
