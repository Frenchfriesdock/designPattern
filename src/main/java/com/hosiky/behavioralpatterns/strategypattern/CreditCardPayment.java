package com.hosiky.behavioralpatterns.strategypattern;

public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String name;

    CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }


    public void pay(double amount) {
        System.out.println("使用信用卡支付：" + amount + "，卡号：" + cardNumber + "，持卡人：" + name);
    }

}
