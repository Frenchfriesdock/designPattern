package com.hosiky.behavioralpatterns.templatemethodpattern;

/**
 * 模版方法模式
 * 背景：
 *
 * 在软件开发中，我们经常遇到一些算法或流程，其中包含一系列固定的步骤，但其中某些步骤的实现可能因情况而异。
 * 如果直接在父类中实现整个算法，会导致子类无法自由地改变算法的某些步骤。
 *
 * 解决方案：
 *
 * 模板方法模式的解决方案是定义一个算法的骨架，其中包含算法的所有步骤。然后，将某些步骤的实现延迟到子类中，
 * 使得子类可以在不改变算法结构的情况下，重新定义某些步骤的具体实现。
 *
 * 实现方式：
 *
 * 模板方法模式的核心是定义一个抽象类，其中包含算法的骨架，以及一系列抽象方法，用于延迟到子类中实现。子类通过继承抽象类，
 * 并实现其中的抽象方法，来自定义算法的具体步骤。
 */
public class client {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        Game football = new Football();
        football.play();
    }
}
