package com.hosiky.behavioralpatterns.strategypattern;

/**
 * 背景：
 *
 * 在软件开发中，有时需要根据不同的情况或需求来执行不同的操作。如果将不同的操作直接嵌入到客户端代码中，会导致代码复杂且难以维护。
 *
 * 解决方案：
 *
 * 策略模式的解决方案是将不同的操作封装成策略类，并定义一个公共的接口或抽象类来表示这些策略。
 * 客户端代码通过持有策略接口的引用来调用具体的策略，从而实现不同的行为。
 *
 * 实现方式：
 *
 * 策略模式的核心是定义一个策略接口或抽象类，其中包含执行策略的方法。具体的策略类实现策略接口，提供不同的算法或行为。
 * 客户端代码持有策略接口的引用，根据需求选择合适的策略对象来完成任务。
 *
 */
public class client {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678", "John Doe");
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkout(1000);

        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        shoppingCart.setPaymentStrategy(payPalPayment);
    }
}
