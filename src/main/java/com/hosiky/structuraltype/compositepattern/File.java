package com.hosiky.structuraltype.compositepattern;

// 文件类，类似于叶子节点
public class File implements FileSystemComponent{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
