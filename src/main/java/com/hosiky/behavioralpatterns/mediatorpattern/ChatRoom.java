package com.hosiky.behavioralpatterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (!sender.equals(user)) {
                user.receiveMessage(sender.getName() + "： " + message);
            }
        }
    }
}
