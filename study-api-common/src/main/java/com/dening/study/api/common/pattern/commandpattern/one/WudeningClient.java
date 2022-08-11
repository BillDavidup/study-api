package com.dening.study.api.common.pattern.commandpattern.one;

/**
 * 客户端角色，操控播放机的人类
 */
public class WudeningClient {

    public static void main(String[] args) {
        //创建接收者对象-播放机
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        AudioCommand playAudioCommand = new PlayAudioCommand(audioPlayer);
        AudioCommand rewindAudioCommand = new RewindAudioCommand(audioPlayer);
        AudioCommand stopAudioCommand = new StopAudioCommand(audioPlayer);

        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayAudioCommand(playAudioCommand);
        keypad.setRewindAudioCommand(rewindAudioCommand);
        keypad.setStopAudioCommand(stopAudioCommand);

        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();

    }
}
