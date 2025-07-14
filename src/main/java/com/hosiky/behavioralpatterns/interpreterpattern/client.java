package com.hosiky.behavioralpatterns.interpreterpattern;

/**
 * 解释器模式
 *
 * 解释器模式是一种行为型设计模式，它用于定义语言的文法规则，并解释执行语言中的表达式。解释器模式将每个表达式抽象成一个类，并通过组合表达式来构建更复杂的表达式。
 */
public class client {

    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(3), new MultiplyExpression(new NumberExpression(4), new NumberExpression(5)));
        int result = expression.interpret();
        System.out.println("表达式计算结果：" + result); // 输出：表达式计算结果：23

    }
}
