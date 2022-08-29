package com.dening.study.api.common.pattern.bridgepattern.one;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机开机。。。。");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机打电话。。。。");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机关机。。。。");
    }
}
