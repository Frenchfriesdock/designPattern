package com.hosiky.behavioralpatterns.observerpattern;

/**
 * 观察者模式
 *
 * 背景：
 *
 * 在软件开发中，有时需要让一个对象（主题或被观察者）与多个其他对象（观察者）保持一致。当主题对象的状态发生变化时，需要通知所有观察者进行相应的更新。
 *
 * 解决方案：
 *
 * 观察者模式的解决方案是定义一个主题接口，其中包含添加、删除和通知观察者的方法。观察者对象实现观察者接口，并在注册时将自身添加到主题对象的观察者列表中。
 * 当主题对象的状态发生变化时，它会通知所有观察者进行更新。
 *
 * 实现方式：
 *
 * 观察者模式的核心是定义一个主题接口，其中包含添加、删除和通知观察者的方法。主题对象中通常维护一个观察者列表，用于保存所有注册的观察者对象。
 * 当主题对象的状态发生变化时，它会遍历观察者列表，并调用每个观察者的更新方法。
 *
 */
public class client {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("Hello World");
    }
}
