package com.hosiky.structuraltype.adapterpattern;

/**
 * 背景：
 *
 * 在现实世界中，我们常常遇到需要将两个不兼容的东西连接在一起的情况。类似地，
 * 当我们使用一个现有的类库或组件，但它的接口与我们的代码不匹配时，就需要使用适配器模式来进行适配。
 *
 * 解决方案：
 *
 * 适配器模式通过引入一个适配器类，将现有的类与客户端的接口进行适配。适配器类包含了客户端所期望的接口，
 * 并持有一个现有类的实例，将客户端的请求转换为现有类的方法调用。
 *
 * 对象适配器： 通过组合，让适配器类持有现有类的实例，并实现目标接口。对象适配器使用组合关系来实现接口的适配，较为常用。
 */
public class client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.playAudio("song.mp3");

        AdvancedMediaPlayer flacPlayer = new FlacPlayer();
        MediaPlayer mediaAdapter = new MediaAdapter(flacPlayer);
        mediaAdapter.playAudio("song.flac");
    }
}
