package com.hosiky.structuraltype.adapterpattern;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void playAudio(String fileName) {
        // 模拟播放MP3音频
        System.out.println("Playing MP3 file: " + fileName);
    }

    @Override
    public void playVideo(String fileName) {
        // 空实现，不支持视频播放
    }
}
