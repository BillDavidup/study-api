package com.dening.study.api.common.pattern.commandpattern.two;

import com.dening.study.api.common.pattern.commandpattern.one.AudioCommand;
import com.dening.study.api.common.pattern.commandpattern.one.AudioPlayer;
import com.dening.study.api.common.pattern.commandpattern.one.PlayAudioCommand;
import com.dening.study.api.common.pattern.commandpattern.one.RewindAudioCommand;
import com.dening.study.api.common.pattern.commandpattern.one.StopAudioCommand;

/**
 * 客户端类
 */
public class MacroAudioCommandClient {

    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        AudioCommand playAudioCommand = new PlayAudioCommand(audioPlayer);
        AudioCommand rewindAudioCommand = new RewindAudioCommand(audioPlayer);
        AudioCommand stopAudioCommand = new StopAudioCommand(audioPlayer);

        MacroAudioCommand macro = new ConcreteMacroAudioCommand();
        macro.add(playAudioCommand);
        macro.add(rewindAudioCommand);
        macro.add(stopAudioCommand);
        macro.execute();
    }

}
