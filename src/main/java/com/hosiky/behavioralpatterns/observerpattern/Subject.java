package com.hosiky.behavioralpatterns.observerpattern;

//创建一个主题接口 Subject
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);


}
