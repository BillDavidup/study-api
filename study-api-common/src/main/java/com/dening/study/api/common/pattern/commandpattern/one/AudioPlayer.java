package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 接收者角色，由录音机类扮演
 */
public class AudioPlayer {

    public void play(){
        System.out.println("命令接收者-录音机正在->播放...");
    }

    public void rewind(){
        System.out.println("命令接收者-录音机正在->倒带...");
    }

    public void stop(){
        System.out.println("命令接收者-录音机正在->停止...");
    }
}
