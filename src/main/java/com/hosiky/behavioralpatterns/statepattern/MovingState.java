package com.hosiky.behavioralpatterns.statepattern;

class MovingState implements ElevatorState {
    private Elevator elevator;

    public MovingState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("电梯不能打开门，先停止移动");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已关闭");
    }

    @Override
    public void move() {
        System.out.println("电梯正在移动");
    }
}