package com.dening.study.api.common.pattern.commandpattern.two;

import com.dening.study.api.common.pattern.commandpattern.one.AudioCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令MacroAudioCommand类负责把个别的命令合成宏命令
 */
public class ConcreteMacroAudioCommand implements MacroAudioCommand {
    private List<AudioCommand> commandList = new ArrayList<AudioCommand>();

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(AudioCommand cmd) {
        commandList.add(cmd);
    }

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void remove(AudioCommand cmd) {
        commandList.remove(cmd);
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        for (AudioCommand cmd : commandList) {
            cmd.execute();
        }
    }
}
