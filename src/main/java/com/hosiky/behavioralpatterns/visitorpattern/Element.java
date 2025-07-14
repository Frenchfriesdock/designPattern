package com.hosiky.behavioralpatterns.visitorpattern;

public interface Element {

    void accept(Visitor visitor);
}
