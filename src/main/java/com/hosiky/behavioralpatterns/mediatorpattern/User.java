package com.hosiky.behavioralpatterns.mediatorpattern;

import lombok.Data;

@Data
public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(this,message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " 收到消息: " + message);
    }


}
