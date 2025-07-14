package com.hosiky.structuraltype.proxypattern;

// 代理图片类
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
        
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        System.out.println("显示加载中...");
        realImage.display();
    }
}
