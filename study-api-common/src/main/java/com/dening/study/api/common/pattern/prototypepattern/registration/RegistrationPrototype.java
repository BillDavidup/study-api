package com.dening.study.api.common.pattern.prototypepattern.registration;

/**
 * 抽象原型角色
 */
public interface RegistrationPrototype {
    public RegistrationPrototype clone();

    public String getName();

    public void setName(String name);
}
