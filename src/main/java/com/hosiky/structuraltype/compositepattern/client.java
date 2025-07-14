package com.hosiky.structuraltype.compositepattern;

/**
 * 组合模式
 *
 * 背景：
 * 遇到整体和部分的层次结构， 多个公司和多个部门，多个部门和多个员工
 *
 * 解决方案
 * 整体-部分的层次结构，树状结构
 *
 * 实现方法：
 * 核心： 定义一个组件接口，包含了组合对象和叶子对象的共同操作，然后创建叶子类节点和组合节点类，他们都是实现了组件接口
 * 组合节点类通常包含一个子组件列表，用于存储子节点
 *
 */
public class client {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        Directory subDirectory1 = new Directory("Sub Directory 1");
        subDirectory1.addComponent(file1);
        subDirectory1.addComponent(file2);

        Directory subDirectory2 = new Directory("Sub Directory 2");
        subDirectory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root Directory");
        rootDirectory.addComponent(subDirectory1);
        rootDirectory.addComponent(subDirectory2);

        rootDirectory.display();

    }
}
