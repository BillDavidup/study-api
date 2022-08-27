package com.dening.study.api.common.pattern.flyweightpattern.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元对象
 */
public class ConcreteCompositeFlyweightC implements FlyweightC {

    private Map<Character, FlyweightC> files = new HashMap<Character, FlyweightC>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key, FlyweightC fly) {
        files.put(key, fly);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void operation(String state) {
        FlyweightC fly = null;
        for (Object o : files.keySet()) {
            fly = files.get(o);
            fly.operation(state);
        }
    }

}
