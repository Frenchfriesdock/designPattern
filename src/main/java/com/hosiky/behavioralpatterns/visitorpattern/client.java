package com.hosiky.behavioralpatterns.visitorpattern;

/**
 * 访问者模式：
 * 访问者模式是一种行为型设计模式，它允许在不改变被访问元素的类的前提下，定义作用于这些元素的新操作。访问者模式将数据结构与操作分离，
 * 使得操作可以独立地变化，而不影响数据结构。
 *
 * 应用场景：
 *
 * 访问者模式常见的应用场景包括：
 *
 * 当一个数据结构中包含多个不同类型的对象，并且希望对这些对象执行不同的操作时，可以使用访问者模式来封装这些操作。
 * 当需要对一个对象结构进行很多不同且不相关的操作时，可以使用访问者模式将这些操作封装在不同的访问者中。
 * 示例：
 *
 * 通过访问者模式，我们可以实现对数据结构的操作与数据结构本身的分离，提高代码的可维护性和扩展性。

 */
public class client {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor); // 输出：执行元素A的操作
        elementB.accept(visitor); // 输出：执行元素B的操作
    }
}
