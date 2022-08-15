package com.dening.study.api.common.pattern.factorypattern.abstracts;

/**
 * Java产品族的具体工厂JavaCourseFactory
 */
public class JavaConcreteCourseFactory extends AbstractCourseFactory {
    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
