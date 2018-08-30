package com.edison.design.creational.adapter;

/**
 * @author edisonyao
 * @class VlcPlayer
 * @date 18-8-30
 * @description
 */
public class VlcPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
