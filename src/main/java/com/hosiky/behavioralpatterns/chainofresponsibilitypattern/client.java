package com.hosiky.behavioralpatterns.chainofresponsibilitypattern;

/**
 * 责任链模式
 *
 * 背景：
 *
 * 在软件开发中，有时一个请求可能需要被多个对象处理，但是每个对象对请求的处理方式可能不同。如果将请求的发送者和接收者直接耦合在一起，会导致代码的复杂性和可扩展性问题。
 *
 * 解决方案：
 *
 * 责任链模式的解决方案是将这些对象组成一条责任链，每个对象都持有下一个对象的引用。当一个对象不能处理请求时，它会将请求传递给下一个对象，直到有一个对象处理为止。
 *
 * 实现方式：
 *
 * 责任链模式的核心是定义一个处理请求的抽象类或接口，其中包含一个处理请求的方法。具体的处理者类继承抽象类或实现接口，并在处理方法中决定是否处理请求或者将请求传递给下一个处理者。
 * 客户端代码持有责任链中的第一个处理者，并将请求发送给它。
 */
public class client {
    public static void main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();

//        创建了处理者链（经理 -> 总监），并向链头发送不同金额的审批请求
        manager.setNextApprover(director);

        double amount1 = 800;
        double amount2 = 3000;
        double amount3 = 7000;

        manager.approve(amount1);
        manager.approve(amount2);
        manager.approve(amount3);
    }
}
