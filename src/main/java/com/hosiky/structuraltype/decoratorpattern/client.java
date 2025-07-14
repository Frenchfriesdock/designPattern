package com.hosiky.structuraltype.decoratorpattern;

/**
 * 装饰器模式(动态添加功能）
 * 背景：
 *
 * 在软件开发中，我们经常遇到需要对现有对象进行功能扩展或修改的情况。但是，直接修改现有对象的代码可能会导致代码的不稳定和难以维护。
 * 此时，装饰器模式可以帮助我们以一种灵活的方式来扩展对象的功能，而不必修改原始对象的代码。
 *
 * 解决方案：
 * 装饰器模式的解决方案是创建一个装饰器类，该类实现了与原始对象相同的接口，并持有一个原始对象的引用。装饰器类中可以包含新的功能，
 * 也可以在调用原始对象的方法前后加入额外的行为。通过将原始对象传递给装饰器，我们可以在运行时动态地为原始对象添加新的功能。
 *
 * 实现方式：
 *
 * 装饰器模式的核心是创建装饰器类，该类实现了与原始对象相同的接口，并持有一个原始对象的引用。在装饰器类中，可以添加新的功能或者调用原始对象的方法，
 * 并在调用前后加入额外的行为。通过组合多个装饰器，我们可以为对象添加多个不同的功能。
 */
public class client {
    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();

        System.out.println("原味咖啡： "+ simpleCoffee.getDescription() + ", 价格: " + simpleCoffee.getCost() + "元");

        Coffee mileDecorator = new MileDecorator(simpleCoffee);
        System.out.println("加牛奶咖啡：" + mileDecorator.getDescription() + "， 价格：" + mileDecorator.getCost() + "元");
    }
}
