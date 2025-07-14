package com.hosiky.behavioralpatterns.mementopattern;


/**
 * 备忘录模式：
 *
 *  背景：
 *
 * 在软件开发中，有时需要保存一个对象的历史状态或者实现撤销操作。如果直接在对象中添加保存状态的方法，可能会破坏对象的封装性。
 *
 * 解决方案：
 *
 * 备忘录模式的解决方案是引入一个备忘录对象，它持有原始对象的状态。原始对象通过创建备忘录对象来保存自己的状态，当需要恢复到原先的状态时，可以从备忘录对象中获取状态。
 *
 * 实现方式：
 *
 * 备忘录模式的核心是定义一个备忘录类，其中包含用于保存原始对象状态的方法。原始对象创建备忘录对象来保存自己的状态，并在需要恢复状态时，从备忘录对象中获取状态。
 */
public class client {
    public static void main(String[] args) {

        Originator originator = new Originator();

        originator.setState("state1");
        Memento memento = originator.createMemento();

        originator.setState("state2");

        System.out.println("当前状态: " + originator.getState());

        originator.restoreMemento(memento);
        System.out.println("回复后的状态: " + originator.getState());
    }
}
