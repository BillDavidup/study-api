package com.dening.study.api.common.pattern.prototypepattern.registration;

/**
 * 具体原型角色
 */
public class RegistrationConcretePrototype2 implements RegistrationPrototype {
    private String name;

    public RegistrationConcretePrototype2 clone() {
        RegistrationConcretePrototype2 prototype = new RegistrationConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString() {
        return "Now in Prototype2 , name = " + this.name;
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
