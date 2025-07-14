package com.hosiky.behavioralpatterns.chainofresponsibilitypattern;

// 抽象审批者类
public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(double amount);
}
