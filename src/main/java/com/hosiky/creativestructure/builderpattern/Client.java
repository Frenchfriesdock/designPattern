package com.hosiky.creativestructure.builderpattern;

/**
 * 背景：
 *
 * 在某些情况下，一个对象的构建过程非常复杂，涉及多个步骤，每个步骤都可能有多种选择。如果直接在客户端代码中进行对象的构建，
 * 会导致构建过程变得庞大而复杂，难以维护和扩展。
 *
 * 解决方案：
 *
 * 建造者模式通过将复杂对象的构建过程封装在一个独立的建造者类中，让客户端代码只需要与建造者进行交互，而不需要知道具体的构建细节。
 * 建造者类负责组装复杂对象的各个部分，并提供一种方法来返回最终构建好的对象。
 *
 * 实现方式：
 *
 * 建造者模式的关键是定义一个独立的建造者类，该类包含构建复杂对象所需的各个步骤，以及一个返回最终对象的方法。
 * 通常，建造者模式还涉及到一个指导者类，用于根据客户端的需求来选择不同的建造者来构建对象。
 *
 * 构建器模式主要解决的是对象参数过多或参数配置过程复杂的问题。当一个类的构造函数有多个参数（尤其是可选参数）时，
 * 直接使用构造函数会导致代码可读性差，而构建器模式通过流式 API让参数配置更清晰
 */
public class Client {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.setSize("大")
                .addCheese()
                .addPepperoni()
                .addBacon()
                .createPizza();

        System.out.println("您的披萨：大小-" + pizza.getSize() +
                "，奶酪-" + pizza.isCheese() +
                "，意式辣香肠-" + pizza.isPepperoni() +
                "，培根-" + pizza.isBacon());

    }
}
