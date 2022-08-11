package com.dening.study.api.common.pattern.commandpattern.classic;

/**
 * 角色：具体命令角色类
 */
public class ConcreteCommand implements Command {

    // 持有相应的命令接收者对象
    private Receiver receiver = null;

    /**
     * 构造方法
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 通常会转调命令接收者对象相应的方法，让接收者来真正执行功能
        receiver.action();
    }

}
