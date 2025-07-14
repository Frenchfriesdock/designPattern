package com.hosiky.creativestructure.singletonpattern;

/**
 * 单例模式
 * 在某些情况下，我们需要确保某个类只有一个实例，比如配置对象、线程池、数据库连接等。如果多次创建实例可能会导致资源浪费、状态不一致等问题。
 *
 * 懒汉式： 在第一次需要使用实例时才创建对象。在多线程环境下，可能会存在竞争条件，需要考虑线程安全问题。
 *
 * 饿汉式： 在类加载时就创建对象。由于在类加载时就创建了实例，因此不存在线程安全问题，但可能会在应用程序启动时造成资源浪费。
 */
public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello World");
    }
}
