package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 具体的播放命令角色类
 */
public class PlayAudioCommand implements AudioCommand {

    // 持有接收者角色，由录音机类扮演
    private AudioPlayer audioPlayer;

    public PlayAudioCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
