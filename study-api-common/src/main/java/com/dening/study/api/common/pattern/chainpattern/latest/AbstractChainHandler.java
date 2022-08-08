package com.dening.study.api.common.pattern.chainpattern.latest;

import com.dening.study.api.common.pattern.chainpattern.UserLoginReq;

/**
 * 抽象责任链
 */
public abstract class AbstractChainHandler<T> {

    protected AbstractChainHandler nextHandler;

    private void nextHandler(AbstractChainHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void doHandler(UserLoginReq req);

    /**
     * 建造者模式
     */
    public static class ChainBuilder<T> {
        private AbstractChainHandler<T> head;
        private AbstractChainHandler<T> tail;

        public ChainBuilder<T> addHandler(AbstractChainHandler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.nextHandler(handler);
            this.tail = handler;
            return this;
        }

        public AbstractChainHandler<T> build() {
            return this.head;
        }
    }

}
