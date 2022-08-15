package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * 抽象工厂AbstractCourseFactory类
 */
public abstract class AbstractCourseFactory {
    public void init() {
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
