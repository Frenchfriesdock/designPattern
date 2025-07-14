package com.hosiky.creativestructure.singletonpattern;

public class Singleton1 {
    // 在类加载时立即初始化实例（饿汉式）
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

    void doSomething() {
        System.out.println("do something");
    }

}
