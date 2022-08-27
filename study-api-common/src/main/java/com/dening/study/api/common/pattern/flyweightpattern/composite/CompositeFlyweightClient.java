package com.dening.study.api.common.pattern.flyweightpattern.composite;

import com.dening.study.api.common.pattern.flyweightpattern.pure.Flyweight;
import com.dening.study.api.common.pattern.flyweightpattern.pure.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;

public class CompositeFlyweightClient {

    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactoryC flyFactory = new FlyweightFactoryC();
        FlyweightC compositeFly1 = flyFactory.factory(compositeState);
        FlyweightC compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        FlyweightC fly1 = flyFactory.factory(state);
        FlyweightC fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }

}
