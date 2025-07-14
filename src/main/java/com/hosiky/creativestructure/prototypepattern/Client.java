package com.hosiky.creativestructure.prototypepattern;

/**
 * 背景：
 *
 * 在某些情况下，创建一个对象的过程非常复杂或耗时，而且我们可能需要创建多个相似的对象。
 * 如果每次都使用构造函数来创建新对象，会产生很大的性能开销。此时，原型模式就可以帮助我们避免这种重复的创建过程
 *
 * 解决方案：
 *
 * 原型模式的解决方案是将一个已有对象作为原型，通过复制这个原型来创建新的对象。这样，我们可以在原型的基础上进行微调和修改，得到一系列相似的对象。
 *
 * 实现方式：
 *
 * 原型模式的关键是实现对象的克隆方法。Java中提供了Cloneable接口来支持对象的克隆，它是一个标记接口，表明对象可以被复制。
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape cloneCircle = (Shape) circle.clone();
        cloneCircle.draw();

        Shape rectangle = new Rectangle();
        Shape cloneRectangle = (Shape) rectangle.clone();
        cloneRectangle.draw();

    }
}
