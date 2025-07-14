package com.hosiky.behavioralpatterns.visitorpattern;

public class ConcreteVisitor implements Visitor{

    public void visitElementA(ElementA elementA) {
        // 实现操作1，处理元素A
        elementA.operationA();
    }

    @Override
    public void visitElementB(ElementB elementB) {
        // 实现操作2，处理元素B
        elementB.operationB();
    }
}
