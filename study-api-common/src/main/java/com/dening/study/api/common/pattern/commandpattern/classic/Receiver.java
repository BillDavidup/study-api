package com.dening.study.api.common.pattern.commandpattern.classic;

/**
 * 角色：命令接收者
 */
public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action() {
        System.out.println("接受者：执行操作");
    }
}
