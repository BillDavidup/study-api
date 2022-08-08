package com.dening.study.api.common.pattern.chainpattern.two;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

/**
 * 抽象的责任处理接口
 */
public abstract class ChainHandler {
    protected ChainHandler nextHandler;

    public void nextHandler(ChainHandler handler) {
        nextHandler = handler;
    }

    public abstract void doHandler(UserLoginReq req);

}
