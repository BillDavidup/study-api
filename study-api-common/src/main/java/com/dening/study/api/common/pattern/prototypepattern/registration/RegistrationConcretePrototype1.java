package com.dening.study.api.common.pattern.prototypepattern.registration;

/**
 * 具体原型角色
 */
public class RegistrationConcretePrototype1 implements RegistrationPrototype {
    private String name;

    public RegistrationPrototype clone() {
        RegistrationConcretePrototype1 prototype = new RegistrationConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString() {
        return "Now in Prototype1 , name = " + this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
