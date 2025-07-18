package com.hosiky.structuraltype.facadepattern;

/**
 * 外观模式
 * 背景：
 *
 * 在现实世界中，有些系统可能由多个复杂的子系统组成，每个子系统可能包含多个类和方法。当我们需要使用这些子系统时，直接调用子系统的方法会使客户端代码变得冗长和复杂。
 *
 * 解决方案：
 *
 * 外观模式的解决方案是创建一个外观类，该类为子系统提供了一个简单的接口，封装了子系统的复杂性。客户端只需要与外观类进行交互，而不需要直接与子系统的类和方法打交道。
 *
 * 实现方式：
 *
 * 外观模式的核心是定义一个外观类，该类为子系统提供了一个简单的接口。外观类中通常包含子系统的实例，并将客户端的请求转发给子系统进行处理。
 *
 */
public class client {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        System.out.println("=====================");
        computerFacade.shutDownComputer();
    }
}
