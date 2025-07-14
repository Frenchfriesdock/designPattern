package com.hosiky.behavioralpatterns.visitorpattern;

public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    // 元素B特有的操作
    void operationB() {
        System.out.println("执行元素B的操作");
    }
}
