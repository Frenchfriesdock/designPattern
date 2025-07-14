package com.hosiky.structuraltype.adapterpattern;

public class FlacPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp3(String fileName) {
        // 空实现，不支持MP3格式
    }

    @Override
    public void playFlac(String fileName) {
        // 模拟播放FLAC音频
        System.out.println("Playing FLAC file: " + fileName);
    }
}
