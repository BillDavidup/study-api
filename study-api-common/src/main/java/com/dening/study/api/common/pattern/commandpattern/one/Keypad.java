package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 请求者角色，由键盘类扮演
 */
public class Keypad {

    private AudioCommand playAudioCommand;
    private AudioCommand rewindAudioCommand;
    private AudioCommand stopAudioCommand;

    public void setPlayAudioCommand(AudioCommand playAudioCommand) {
        this.playAudioCommand = playAudioCommand;
    }

    public void setRewindAudioCommand(AudioCommand rewindAudioCommand) {
        this.rewindAudioCommand = rewindAudioCommand;
    }

    public void setStopAudioCommand(AudioCommand stopAudioCommand) {
        this.stopAudioCommand = stopAudioCommand;
    }

    /**
     * 执行播放方法
     */
    public void play() {
        playAudioCommand.execute();
    }

    /**
     * 执行倒带方法
     */
    public void rewind() {
        rewindAudioCommand.execute();
    }

    /**
     * 执行播放方法
     */
    public void stop() {
        stopAudioCommand.execute();
    }
}
