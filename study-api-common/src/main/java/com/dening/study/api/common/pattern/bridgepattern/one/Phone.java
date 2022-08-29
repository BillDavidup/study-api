package com.dening.study.api.common.pattern.bridgepattern.one;

public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }

    protected void close() {
        this.brand.close();
    }
}

