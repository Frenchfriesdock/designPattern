package com.hosiky.structuraltype.proxypattern;

/**
 * 代理模式
 * 背景：
 *
 * 在某些情况下，我们希望对一个对象进行控制，比如限制对对象的访问权限、在访问对象之前做一些预处理、
 * 或者在访问对象之后做一些后处理。但是直接对原始对象进行修改可能会违背开闭原则和单一职责原则。
 *
 * 解决方案：
 *
 * 代理模式的解决方案是创建一个代理对象，该对象持有原始对象的引用，并实现与原始对象相同的接口。
 * 在代理对象的方法中，我们可以添加额外的功能来实现对原始对象的控制。
 *
 * 实现方式：
 *
 * 代理模式的核心是创建一个代理类，该类实现了与原始对象相同的接口，并持有一个原始对象的引用。在代理类的方法中，我们可以添加额外的功能，然后将请求转发给原始对象进行处理
 */
public class client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image2.display();

        image1.display();
        image2.display();
    }
}
