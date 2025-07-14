package com.hosiky.behavioralpatterns.visitorpattern;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    // 元素A特有的操作
    void operationA() {
        System.out.println("执行元素A的操作");
    }
}
