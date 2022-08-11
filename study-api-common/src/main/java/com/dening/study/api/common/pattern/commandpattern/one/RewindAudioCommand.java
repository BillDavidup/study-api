package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 具体的倒带命令角色类
 */
public class RewindAudioCommand implements AudioCommand {

    // 持有接收者角色，由录音机类扮演
    private AudioPlayer audioPlayer;

    public RewindAudioCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
