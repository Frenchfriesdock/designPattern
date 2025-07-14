package com.hosiky.behavioralpatterns.mediatorpattern;

/**
 * 中介模式
 * 它用于减少对象之间的直接通信，而是通过一个中介者对象来进行消息传递。中介者模式将对象之间的通信集中在中介者对象中，
 * 从而降低对象之间的耦合性，增加系统的可维护性和灵活性。
 *
 * 背景：
 *
 * 在软件开发中，对象之间的直接通信可能会导致高度耦合的代码，一旦一个对象发生改变，可能会影响其他对象。同时，对象之间的通信可能会变得复杂难以维护。
 *
 * 解决方案：
 *
 * 中介者模式的解决方案是引入一个中介者对象，它负责对象之间的通信，并将对象之间的关系解耦。当一个对象需要与其他对象通信时，
 * 它只需与中介者对象通信，而无需直接与其他对象交互。
 *
 * 实现方式：
 *
 * 中介者模式的核心是定义一个中介者接口，其中包含对象之间通信的方法。具体的中介者类实现中介者接口，并持有一组需要通信的对象的引用。
 * 当一个对象需要与其他对象通信时，它通过中介者对象来进行消息传递。
 */
public class client {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello world");
    }
}
