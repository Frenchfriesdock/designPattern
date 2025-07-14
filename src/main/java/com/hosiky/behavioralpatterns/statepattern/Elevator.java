package com.hosiky.behavioralpatterns.statepattern;

public class Elevator {

    private ElevatorState currentState;

    public Elevator() {
        currentState = new DoorClosedState(this); // 传入上下文引用
    }

    public void setState(ElevatorState state) {
        currentState = state;
    }

    public void openDoor() {
        currentState.openDoor();
    }

    public void closeDoor() {
        currentState.closeDoor();
    }

    public void move() {
        currentState.move();
    }
}
