package com.dening.study.api.common.pattern.bridgepattern.two;

/**
 * 实现消息发送的统一接口
 */
public interface IMessage {
    //要发送的消息的内容和接收人
    void send(String message, String toUser);
}

