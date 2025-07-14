package com.hosiky.behavioralpatterns.statepattern;

class DoorClosedState implements ElevatorState {
    private Elevator elevator;

    public DoorClosedState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("电梯门打开");
        elevator.setState(new DoorOpenedState(elevator));
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已关闭");
    }

    @Override
    public void move() {
        System.out.println("电梯开始移动");
        elevator.setState(new MovingState(elevator));
    }
}
