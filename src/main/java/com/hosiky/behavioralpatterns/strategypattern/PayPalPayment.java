package com.hosiky.behavioralpatterns.strategypattern;

public class PayPalPayment implements PaymentStrategy{

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用PayPal支付：" + amount + "，邮箱：" + email);
    }
}
