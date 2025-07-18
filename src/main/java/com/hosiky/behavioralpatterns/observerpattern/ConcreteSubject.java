package com.hosiky.behavioralpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
