package com.hosiky.behavioralpatterns.statepattern;

class DoorOpenedState implements ElevatorState {
    private Elevator elevator;

    public DoorOpenedState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("电梯门已打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门关闭");
        elevator.setState(new DoorClosedState(elevator));
    }

    @Override
    public void move() {
        System.out.println("电梯不能移动，先关闭门");
    }
}