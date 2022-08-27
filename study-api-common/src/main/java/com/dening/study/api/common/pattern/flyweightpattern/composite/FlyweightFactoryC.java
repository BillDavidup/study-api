package com.dening.study.api.common.pattern.flyweightpattern.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂角色提供两种不同的方法，一种用于提供单纯享元对象，另一种用于提供复合享元对象。
 */
public class FlyweightFactoryC {

    private Map<Character, FlyweightC> files = new HashMap<Character, FlyweightC>();

    /**
     * 复合享元工厂方法
     */
    public FlyweightC factory(List<Character> compositeState) {
        ConcreteCompositeFlyweightC compositeFly = new ConcreteCompositeFlyweightC();

        for (Character state : compositeState) {
            compositeFly.add(state, this.factory(state));
        }

        return compositeFly;
    }

    /**
     * 单纯享元工厂方法
     */
    public FlyweightC factory(Character state) {
        //先从缓存中查找对象
        FlyweightC fly = files.get(state);
        if (fly == null) {
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweightC(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }

}
