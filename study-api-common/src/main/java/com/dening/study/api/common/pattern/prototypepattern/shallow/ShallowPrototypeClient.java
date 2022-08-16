package com.dening.study.api.common.pattern.prototypepattern.shallow;

import java.util.ArrayList;
import java.util.List;

public class ShallowPrototypeClient {

    public static void main(String[] args) {
        //创建原型对象
        ShallowConcretePrototype prototype = new ShallowConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);
        //复制原型对象
        ShallowConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("技术控");

        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);

    }
}
