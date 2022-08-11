package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 具体的停止命令角色类
 */
public class StopAudioCommand implements AudioCommand {

    // 持有接收者角色，由录音机类扮演
    private AudioPlayer audioPlayer;

    public StopAudioCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }

}
