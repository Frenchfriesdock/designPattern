package com.hosiky.structuraltype.adapterpattern;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void playAudio(String fileName) {
        // 将请求适配为FLAC格式播放
        advancedMediaPlayer.playFlac(fileName);
    }

    @Override
    public void playVideo(String fileName) {
        // 空实现，不支持视频播放
    }
}
