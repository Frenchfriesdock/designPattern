package com.hosiky.behavioralpatterns.commandpattern;

/**
 * 命令模式：
 * 它将请求或操作封装成一个对象，从而使得可以用不同的请求来参数化其他对象。命令模式允许我们将请求者（客户端）和执行者（接收者）解耦，
 * 使得请求者不需要知道执行者的具体实现。
 *
 * 背景：
 *
 * 在软件开发中，经常需要将某些操作封装成对象，并延迟执行这些操作。例如，撤销（undo）操作、菜单选项、按钮点击等都可以用命令模式来实现。
 *
 * 解决方案：
 *
 * 命令模式的解决方案是定义一个命令接口，其中包含一个执行操作的方法。然后，创建具体的命令类，实现命令接口，并持有一个接收者对象的引用，
 * 用于执行具体的操作。最后，客户端可以通过创建不同的命令对象，并将其传递给请求者（调用者）来实现不同的操作。
 *
 * 实现方式：
 *
 * 命令模式的核心是定义一个命令接口，其中包含一个执行操作的方法。然后，创建具体的命令类，实现命令接口，并持有一个接收者对象的引用。
 * 请求者类（Invoker）持有一个命令对象，并在需要执行操作时，调用命令对象的执行方法。
 *
 */
public class client {
    public static void main(String[] args) {
        Light light = new Light();

        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);

//        执行命令
        turnOnLightCommand.execute();
        turnOffLightCommand.execute();
    }
}
