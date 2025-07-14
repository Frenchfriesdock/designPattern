package com.hosiky.behavioralpatterns.chainofresponsibilitypattern;

public class Manager extends Approver{
    @Override
    public void approve(double amount) {
        if(amount <= 1000) {
            System.out.println("经理批准了金额： "  + amount);
        } else if(nextApprover != null) {
            nextApprover.approve(amount);
        } else {
            System.out.println("金额超过审批权限：" + amount);
        }
    }
}
