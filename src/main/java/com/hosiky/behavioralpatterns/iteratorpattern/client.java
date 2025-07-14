package com.hosiky.behavioralpatterns.iteratorpattern;

/**
 * 迭代器模式
 *
 *  背景：
 *
 * 在软件开发中，我们经常需要遍历聚合对象中的元素，比如遍历一个列表、数组或集合。
 * 如果直接在客户端代码中使用循环来遍历聚合对象，会暴露聚合对象的内部表示，导致客户端代码与聚合对象的具体实现耦合在一起。
 *
 * 解决方案：
 *
 * 迭代器模式的解决方案是引入一个迭代器对象，它持有聚合对象的引用，并提供一种顺序访问聚合对象中元素的方法。通过使用迭代器对象，
 * 客户端代码可以在不关心聚合对象的具体结构的情况下，遍历聚合对象中的元素
 *
 * 实现方式：
 *
 * 迭代器模式的核心是定义一个迭代器接口，其中包含访问聚合对象元素的方法。然后，聚合对象实现迭代器接口，返回一个迭代器对象。
 * 客户端通过迭代器对象来遍历聚合对象中的元素，而不需要知道聚合对象的具体结构。
 *
 *
 *迭代器模式是 for-each 的基础：迭代器模式为 for-each 提供了理论支持和实现基础。
 * 简单来说，for-each 是迭代器模式的一种具体应用，但迭代器模式的能力远不止于此。
 */


public class client {
    public static void main(String[] args) {
        String[] data = {"A","B","C","D","E","F","G","H"};
        MyList myList = new MyList(data);

        System.out.println("Elements in MyList:");
        while (myList.hasNext()) {
            System.out.println(myList.next());
        }
    }
}
