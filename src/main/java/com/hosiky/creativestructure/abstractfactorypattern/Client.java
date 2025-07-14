package com.hosiky.creativestructure.abstractfactorypattern;


/**
 *
 * 应用场景：
 *
 * 当系统需要一组相互关联的对象，并希望统一创建这组对象时，抽象工厂模式非常适用。它允许客户端使用抽象的接口来创建一组相关的产品，
 * 从而实现松耦合，并且能够方便地更换不同的产品组合。
 *
 * 抽象工厂模式：
 *  抽象工厂可以实现对多个工厂的创建，每一个抽象工厂可以看成是多个简单工厂的集合
 *  客户端代码只需要与抽象工厂和抽象产品进行交互，也无需关心具体的实现细节，从而实现了对象的解耦和灵活性。
 */
public class Client {
    public static void main(String[] args) {
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Button button = windowsGUIFactory.createButton();
        TextField textField = windowsGUIFactory.createTextField();

        MacGUIFactory macGUIFactory = new MacGUIFactory();
        Button macGUIFactoryButton = macGUIFactory.createButton();
        TextField macGUIFactoryTextField = macGUIFactory.createTextField();

        button.render();
        textField.display();

        macGUIFactoryTextField.display();
        macGUIFactoryButton.render();

    }
}
