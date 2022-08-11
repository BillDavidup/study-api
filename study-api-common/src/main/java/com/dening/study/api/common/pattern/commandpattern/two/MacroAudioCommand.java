package com.dening.study.api.common.pattern.commandpattern.two;

import com.dening.study.api.common.pattern.commandpattern.one.AudioCommand;

/**
 * 代表宏命令的接口，以定义出具体宏命令所需要的接口。
 */
public interface MacroAudioCommand extends AudioCommand {

    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    public void add(AudioCommand cmd);

    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    public void remove(AudioCommand cmd);

}
