package com.hosiky.behavioralpatterns.statepattern;


/**
 * 状态模式
 */
public class client {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.openDoor(); // 输出：电梯门打开
        elevator.move();     // 输出：电梯不能移动，先关闭门

        elevator.closeDoor(); // 输出：电梯门关闭
        elevator.move();      // 输出：电梯开始移动

        elevator.openDoor();  // 输出：电梯不能打开门，先停止移动
    }
}
