package com.edison.design.creational.adapter;

/**
 * @author edisonyao
 * @class Mp4Player
 * @date 18-8-30
 * @description
 */
public class Mp4Player implements IAdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
