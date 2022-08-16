package com.dening.study.api.common.pattern.prototypepattern.easy;

public class EasyPrototypeClient {

    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public EasyPrototypeClient(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation(Prototype example) {
        //需要创建原型接口的对象
        Prototype copyPrototype = (Prototype) prototype.clone();

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        EasyPrototypeClient client = new EasyPrototypeClient(concretePrototype1);
        ConcretePrototype1 clone = (ConcretePrototype1) client.clone();
    }
}
