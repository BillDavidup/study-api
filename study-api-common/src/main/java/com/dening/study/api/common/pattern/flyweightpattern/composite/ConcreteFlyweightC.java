package com.dening.study.api.common.pattern.flyweightpattern.composite;

/**
 * 　具体享元角色类
 */
public class ConcreteFlyweightC implements FlyweightC {
    private Character intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     *
     * @param state
     */
    public ConcreteFlyweightC(Character state) {
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        // TODO Auto-generated method stub
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
