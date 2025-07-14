package com.hosiky.creativestructure.singletonpattern;

public class Singleton {

    private static Singleton instance;

//    私有构造函数，防止外部实例化
    private Singleton() {}

//    全局访问点，获取唯一实例
//    懒汉式的单例模式的方法
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}
